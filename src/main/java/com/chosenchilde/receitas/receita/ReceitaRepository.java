package com.chosenchilde.receitas.receita;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceitaRepository extends JpaRepository<Receita, Long> {
	
	final String DEFAULTPARAMS = "rdate <= NOW() AND rstatus = 'on'";

	// Pesquisa
	@Query(value = "SELECT * FROM RECEITA WHERE " + DEFAULTPARAMS + " UPPER (NAME) LIKE UPPER (concat('%', :q1, '%'))  OR UPPER (CONTENT) LIKE  UPPER (concat('%', :q1, '%'))  OR  UPPER (INGREDIENTS) LIKE  UPPER (concat('%', :q1, '%'))  AND STATUS = 'on'", nativeQuery = true)
	List<Receita> buscaReceita(@Param("q1") String q1);

	// Retorna todas as receitas com limite na página inicial
	@Query(value = "SELECT * FROM RECEITA WHERE " + DEFAULTPARAMS + " ORDER BY VIEW DESC LIMIT :limit", nativeQuery = true)
	List<Receita> findRecipeWithLimit(@Param("limit") int limit);
	
	// Atualiza a quantidade de views do artigo pelo Id.
		@Modifying
		@Query(value = "UPDATE receita SET rviews = rviews + 1 WHERE " 
				+ " AND rid = :id", nativeQuery = true)
		void updateViews(@Param("id") Long id);
		
		// Verifica se uma receita existe ou é ativo.
		@Query(value = "SELECT CASE WHEN COUNT(rid) > 0 THEN true ELSE false END FROM receita WHERE " + DEFAULTPARAMS
				+ " AND rid = :id", nativeQuery = true)
		boolean existsById(@Param("id") Long id);
		
		// Obtém as receitas de um autor, exceto a receita com "id", em ordem aleatória.
		@Query(value = "SELECT * FROM receita WHERE " + DEFAULTPARAMS
				+ " AND rauthor = :uid AND rid != :receitaId ORDER BY RAND() LIMIT :limit", nativeQuery = true)
		List<Receita> findAllByAuthor(@Param("uid") Long uid, @Param("receitaId") Long receitaId,
				@Param("limit") int limit);
		
		// Obtém um receita pelo Id.
		@Query(value = "SELECT * FROM receita WHERE " + DEFAULTPARAMS + " AND rid = :id", nativeQuery = true)
		Receita findReceitaById(@Param("id") Long id);
		
		// Obtém as receitas mais visualizados decrescente.
		@Query(value = "SELECT * FROM receita WHERE " + DEFAULTPARAMS
				+ " ORDER BY rviews DESC LIMIT :limit", nativeQuery = true)
		List<Receita> findMostViewedReceitas(@Param("limit") int limit);

		// Obtém todos as receitas ordenados pela data decrescente.
		@Query(value = "SELECT * FROM receita WHERE " + DEFAULTPARAMS + " ORDER BY rdate DESC", nativeQuery = true)
		List<Receita> findAllValidReceitas();
		
		// Busca artigos com os dados do autor.
		@Query(value = "SELECT * FROM receita INNER JOIN usuario ON uname = uid WHERE rdate <= NOW() AND rstatus = 'on' ORDER BY rdate DESC", nativeQuery = true)
		List<Receita> findArticlesWithUserData();
}

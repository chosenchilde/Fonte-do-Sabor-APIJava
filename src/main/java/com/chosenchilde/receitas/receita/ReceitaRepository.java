package com.chosenchilde.receitas.receita;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface ReceitaRepository extends JpaRepository<Receita, Long> {

	final String DEFAULTPARAMS = "rdate <= NOW() AND rstatus = 'on'";

	// TESTADO OK
	// Busca todas as 5 receitas mais visualizadas. Exemplo:
	// GET → http://domain.api/receita/home/5
	@Query(value = "SELECT * FROM RECEITA WHERE " + DEFAULTPARAMS
			+ " ORDER BY RDATE DESC LIMIT :limit", nativeQuery = true)
	List<Receita> findRecipeWithLimit(@Param("limit") int limit);
	
	//Busca todas as receitas mais vistas utilizando um limite.
	@Query(value = "SELECT * FROM RECEITA WHERE " + DEFAULTPARAMS
			+ " ORDER BY RVIEW DESC LIMIT :limit", nativeQuery = true)
	List<Receita> findRecipeMostViewed(@Param("limit") int limit);
     
	// TESTADO OK
	// Atualiza a quantidade de views da receita pelo Id.
	// Atualiza as visualizações. Exemplo:
	// PATCH → http://domain.api/receita/40
	@Modifying
	@Query(value = "UPDATE receita SET rview = rview + 1 WHERE " + DEFAULTPARAMS + " AND rid = :id", nativeQuery = true)
	void updateViews(@Param("id") Long id);

	
	
    // TESTADO OK
	// Verifica se uma receita existe ou é ativo.
	@Query(value = "SELECT CASE WHEN COUNT(rid) > 0 THEN true ELSE false END FROM receita WHERE " + DEFAULTPARAMS
			+ " AND rid = :id", nativeQuery = true)
	boolean existsById(@Param("id") Long id);

	
	// TESTADO OK
	// Obtém as receitas de um autor, exceto a receita com "id", em ordem aleatória.
	@Query(value = "SELECT * FROM receita WHERE " + DEFAULTPARAMS
			+ " AND rauthor = :uid AND rid != :receitaId ORDER BY RAND() LIMIT :limit", nativeQuery = true)
	List<Receita> findAllByAuthor(@Param("uid") Long uid, @Param("receitaId") Long receitaId,
			@Param("limit") int limit);

	// TESTADO OK
	// Obtém um receita pelo Id.
	@Query(value = "SELECT * FROM receita WHERE " + DEFAULTPARAMS + " AND rid = :id", nativeQuery = true)
	Receita findReceitaById(@Param("id") Long id);

	
	// TESTADO OK
	// Já há uma query acima sendo utilizada.
	// Obtém as receitas mais visualizados decrescente.
	@Query(value = "SELECT * FROM receita WHERE " + DEFAULTPARAMS
			+ " ORDER BY rview DESC LIMIT :limit", nativeQuery = true)
	List<Receita> findMostViewedReceitas(@Param("limit") int limit);

	
	// Obtém todas as receitas ordenados pela data decrescente.
	@Query(value = "SELECT * FROM receita WHERE " + DEFAULTPARAMS + " ORDER BY rdate DESC", nativeQuery = true)
	List<Receita> findAllValidReceitas();

	
	// TESTADO OK
	// Busca por uma palavra ou termo nos campos "title", "resume" e "content".
	@Query(value = "SELECT * FROM receita WHERE " + DEFAULTPARAMS
			+ " AND UPPER(rname) LIKE UPPER(CONCAT('%', :query, '%')) OR UPPER(rcontent) LIKE UPPER(CONCAT('%', :query, '%')) OR UPPER(ringredients) LIKE UPPER(CONCAT('%', :query, '%')) ORDER BY rdate DESC", nativeQuery = true)
	List<Receita> findByWord(@Param("query") String query);

	// TESTADO OK
	// Busca receitas com os dados do autor.
	@Query(value = "SELECT * FROM receita INNER JOIN usuario ON rauthor = uid WHERE rdate <= NOW() AND rstatus = 'on' ORDER BY rdate DESC", nativeQuery = true)
	List<Receita> findReceitasWithUserData();
}

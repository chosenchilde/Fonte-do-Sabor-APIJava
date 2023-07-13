package com.chosenchilde.receitas.comentarios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ComentariosRepository extends JpaRepository<Comentarios, Long> {

	final String DEFAULTPARAMS = "status = 'on'";
	
	// Pesquisa por comentários pelo autor, artigo e comentário.
	@Query(value = "SELECT * FROM comentarios WHERE user_status = 'on'"
			+ " AND uid = :uid AND recipe = :art AND comment = :txt", nativeQuery = true)
	List<Comentarios> findComentariosByUsuarioAndReceita(@Param("uid") String uid, @Param("art") Long art,
			@Param("txt") String txt);

	// Retorna todos os comentários de uma receita.
		@Query(value = "SELECT * FROM comentarios WHERE recipe = :receitaId ORDER BY date DESC", nativeQuery = true)
		List<Comentarios> findAllComentariosByReceita(@Param("receitaId") Long receitaId);


	
}


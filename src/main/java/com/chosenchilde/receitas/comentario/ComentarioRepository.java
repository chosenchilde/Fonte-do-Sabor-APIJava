package com.chosenchilde.receitas.comentario;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ComentarioRepository extends JpaRepository<Comentario, Long> {

	final String DEFAULTPARAMS = "status = 'on'";
	
	// Pesquisa por comentários pelo autor, artigo e comentário.
	@Query(value = "SELECT * FROM comentario WHERE user_status = 'on'"
			+ " AND uid = :uid AND recipe = :art AND comment = :txt", nativeQuery = true)
	List<Comentario> findComentariosByUsuarioAndReceita(@Param("uid") String uid, @Param("art") Long art,
			@Param("txt") String txt);

	// Retorna todos os comentários de uma receita.
		@Query(value = "SELECT * FROM comentario WHERE recipe = :receitaId ORDER BY date DESC", nativeQuery = true)
		List<Comentario> findAllComentariosByReceita(@Param("receitaId") Long receitaId);


	
}


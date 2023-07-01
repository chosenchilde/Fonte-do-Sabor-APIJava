package com.chosenchilde.receitas.comentarios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ComentariosRepository extends JpaRepository<Comentarios, Long> {

	// Pesquisa por comentários pelo autor, artigo e comentário.
	@Query(value = "SELECT * FROM comments WHERE status = 'on'"
			+ " AND uid = :uid AND receita = :art AND comment = :txt", nativeQuery = true)
	List<Comentarios> findComentariosByUsuarioAndReceita(@Param("uid") String uid, @Param("art") Long art,
			@Param("txt") String txt);

}

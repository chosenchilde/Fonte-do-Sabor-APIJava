package com.chosenchilde.receitas.receita;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceitaRepository extends JpaRepository<Receita, Long> {

	@Query(value = "SELECT * FROM RECEITA WHERE UPPER (NAME) LIKE UPPER (concat('%', :q1, '%'))  OR UPPER (CONTENT) LIKE  UPPER (concat('%', :q1, '%'))  OR  UPPER (INGREDIENTS) LIKE  UPPER (concat('%', :q1, '%'))  AND STATUS = 'on'", nativeQuery = true)
	List<Receita> buscaReceita(@Param("q1") String q1);
	
	/* SELECT * FROM RECEITA  INNER JOIN USUARIO ON RECEITA.AUTHOR = USUARIO.ID */
}

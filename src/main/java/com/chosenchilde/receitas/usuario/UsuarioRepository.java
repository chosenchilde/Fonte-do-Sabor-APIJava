package com.chosenchilde.receitas.usuario;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	// Lista todos os campos, exceto 'password'.
		final String DEFAULTFIELDS = "uid, ubio, ubirth, udate, uemail, uname, '' AS upassword, uphoto, ustatus, utype";

		@Query(value = "SELECT " + DEFAULTFIELDS + " FROM usuario WHERE uid = :id", nativeQuery = true)
		Optional<Usuario> findById(@Param("id") Long id);

		@Query(value = "SELECT " + DEFAULTFIELDS + " FROM usuario WHERE ustatus = 'on'", nativeQuery = true)
		List<Usuario> findAllUsers();
	
}

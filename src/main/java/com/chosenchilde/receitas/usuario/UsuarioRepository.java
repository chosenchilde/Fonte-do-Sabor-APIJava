package com.chosenchilde.receitas.usuario;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	@Query(value = "SELECT * FROM usuario WHERE uid = :id", nativeQuery = true)
	Optional<Usuario> findById(@Param("id") Long id);

	@Query(value = "SELECT * FROM usuario WHERE ustatus = 'on'", nativeQuery = true)
	List<Usuario> findAllUsers();
}

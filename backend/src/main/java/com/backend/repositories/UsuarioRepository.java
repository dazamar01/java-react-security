package com.backend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.entities.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

	public List<Usuario> findAll();
	
	public Usuario findByUsernameAndPassword(String username, String password);
	
	public Usuario findByUsername(String username);
	
}

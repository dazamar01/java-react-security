package com.backend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.entities.RolUsuario;


@Repository
public interface RolUsuarioRepository extends JpaRepository<RolUsuario, Integer>  {

	public List<RolUsuario> findAll();
	
}

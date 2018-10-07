package com.backend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.entities.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{

	public List<Rol> findAll();
	
}

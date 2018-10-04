package com.api.services;

import com.api.entities.Usuario;

public interface AuthenticationService {

	public boolean validarLoginUsuario(Usuario usuario) throws Exception;
	
}

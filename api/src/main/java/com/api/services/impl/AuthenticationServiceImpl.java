package com.api.services.impl;

import org.springframework.stereotype.Service;

import com.api.entities.Usuario;
import com.api.services.AuthenticationService;

@Service
public class AuthenticationServiceImpl implements AuthenticationService{

	@Override
	public boolean validarLoginUsuario(Usuario usuario) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}

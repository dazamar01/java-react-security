package com.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.entities.Usuario;
import com.api.services.AuthenticationService;

@RestController
@RequestMapping("/auth")
public class AuthenticationResource {

	@Autowired
	AuthenticationService authenticationService;
	
	//401 : Unauthorized
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@PostMapping("/login")
	public ResponseEntity validarLoginUsuario(@RequestBody Usuario usuario) 
	{
		String jwt;
		boolean status  = false;
		try {
			status = authenticationService.validarLoginUsuario(usuario);
			
			long time = System.currentTimeMillis();
			
			// LEER SOBRE LOS CLAIM QUE DEBERÍAN AGREGARSE
			
			if (status) {
				//construir el JWT
				
				
				
				
			}
			
			// return new ResponseEntity(-1, HttpStatus.UNAUTHORIZED);
			
		}catch(Exception ex) {
			return new ResponseEntity(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity(1, HttpStatus.OK);
		
	}
	
}

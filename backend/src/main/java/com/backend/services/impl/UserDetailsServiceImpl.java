package com.backend.services.impl;

import static java.util.Collections.emptyList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.backend.entities.Usuario;
import com.backend.model.UsuarioVO;
import com.backend.repositories.RolUsuarioRepository;
import com.backend.repositories.UsuarioRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private RolUsuarioRepository rolUsuarioRepository;

//    public UserDetailsServiceImpl(UsuarioRepository applicationUserRepository) {
//        this.usuarioRepository = applicationUserRepository;
//    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
    	// Se busca al usuario
    	Usuario usuario = usuarioRepository.findByUsername(username);
    	
        if (usuario == null) {
            throw new UsernameNotFoundException(username);
        }

    	UsuarioVO usuarioVO = new UsuarioVO(usuario);
    	
        // con el usuario encontrado, se obtienen sus roles
    	usuarioVO.setRoles(rolUsuarioRepository.findByUsuario(usuario));
        
        //Convertir esos roles a una lista de granted authorities
        
        return new User(usuario.getUsername(), usuario.getPassword(), emptyList());
    }
	
}

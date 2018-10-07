package com.backend.services.impl;

import static java.util.Collections.emptyList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.backend.entities.Usuario;
import com.backend.repositories.UsuarioRepository;
// import com.backend.services.UserDetailsService;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	private UsuarioRepository usuarioRepository;

    public UserDetailsServiceImpl(UsuarioRepository applicationUserRepository) {
        this.usuarioRepository = applicationUserRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
    	Usuario applicationUser = usuarioRepository.findByUsername(username);
        
        if (applicationUser == null) {
            throw new UsernameNotFoundException(username);
        }
        return new User(applicationUser.getUsername(), applicationUser.getPassword(), emptyList());
    }
	
}

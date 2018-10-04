package com.api.security;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;

import com.api.model.JwtAuthenticationToken;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
	References:
		https://www.youtube.com/watch?v=-HYrUs1ZCLI
	JWT:	
		https://jwt.io/
	Git:
		
*/
public class JwtAuthenticationTokenFilter extends AbstractAuthenticationProcessingFilter {
	
	public JwtAuthenticationTokenFilter() {
        super("/rest/**");
    }
	
	@Override
    public Authentication attemptAuthentication(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws AuthenticationException, IOException, ServletException {

        String header = httpServletRequest.getHeader("Authorisation");


        if (header == null || !header.startsWith("Token ")) {
            throw new RuntimeException("No se encuentra JWT");
        }

        String authenticationToken = header.substring(6);

        JwtAuthenticationToken token = new JwtAuthenticationToken(authenticationToken);
        
        return getAuthenticationManager().authenticate(token);
        
    }
	
	@Override
	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
			Authentication authResult) throws IOException, ServletException {
		super.successfulAuthentication(request, response, chain, authResult);
		chain.doFilter(request, response);
	}
	

}

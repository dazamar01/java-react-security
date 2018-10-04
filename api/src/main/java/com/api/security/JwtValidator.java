package com.api.security;

import org.springframework.stereotype.Component;

import com.api.model.JwtUser;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

@Component
public class JwtValidator {

	String SECRET_KEY = "lkasdyiaystdu weq";

	public JwtUser validate(String token) {

		JwtUser jwtUser = null;

		try {

			Claims body = Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody();

			jwtUser = new JwtUser();

			jwtUser.setUserName(body.getSubject());
			jwtUser.setId(Long.parseLong((String) body.get("userId")));
			jwtUser.setRole((String) body.get("role"));

		} catch (Exception ex) {

		}

		return jwtUser;
	}

}

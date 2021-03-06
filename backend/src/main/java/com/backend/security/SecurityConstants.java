package com.backend.security;

public class SecurityConstants {
	
	public static final String host = "http://localhost:8080";
	
	public static final String FRONT_END_SERVER = "http://localhost:3000";
	
    public static final String SECRET = "fr1j0l";
    public static final long EXPIRATION_TIME = 864_000_000; // 10 days
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/login";

//    public static final String SIGN_UP_URL = host + "/login";
    public static final String ROLE_PREFIX = "ROLE_";
    
}

package com.backend;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/*
 * References:
 * 	https://auth0.com/blog/implementing-jwt-authentication-on-spring-boot/
 * */

@SpringBootApplication
public class BackendApplication  implements ApplicationRunner{

	private static final Logger logger = LogManager.getLogger(BackendApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
	
	@Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
	
	/*
	
	You can check for the repository on
	https://github.com/callicoder/spring-boot-log4j-2-demo/blob/master/src/main/resources/log4j2.xml
	
	Also, you can check the article which I've based on
	*/
	@Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        logger.debug("Starting");
        /*
        logger.info("Info log");
        logger.warn("Hey, This is a warning!");
        logger.error("Oops! We have an Error. OK");
        logger.fatal("Damn! Fatal error. Please fix me.");
        */
    }
	
}

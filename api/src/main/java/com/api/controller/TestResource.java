package com.api.controller;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.services.util.Constantes;

@RestController
@RequestMapping("/rest/test")
public class TestResource {

	
	private final static Logger LOGGER = Logger.getLogger("");
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String test(HttpServletRequest request,
            @RequestParam(value = "p", required = false) String p) {

        try {

            return "TEST DONE";

        } catch (Exception ex) {
            LOGGER.log(Constantes.LOG_LEVEL_ERROR, "TestResource");
            LOGGER.log(Constantes.LOG_LEVEL_ERROR, ex.getMessage());
        }

        return null;
    }
	
	
}

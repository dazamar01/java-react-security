package com.backend.controllers;

import java.util.List;

import org.springframework.scheduling.config.Task;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/tasks")
public class TestController {

	@GetMapping
    public List<Task> getTasks() {
        return null;
    }

	@PreAuthorize("hasRole('ADMINISTRADOR')")
	@GetMapping("/onlyadmin")
    public String onlyAdmin() {
        return "TEST OK: {ONLY ADMIN ROLE}";
    }

	@PreAuthorize("hasRole('USUARIO')")
	@GetMapping("/onlyuser")
    public String onlyUser() {
        return "ONLY USER ALLOWED";
    }
	
}

package com.backend.controllers;

import java.util.List;

import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TestController {

	@GetMapping
    public List<Task> getTasks() {
        return null;
    }
	
}

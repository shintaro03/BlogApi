package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
	
	@Autowired
	PostDataRepository repository;
	
	@RequestMapping("/")
	public List<PostData> index() {
		
		return repository.findAll();
	}
}

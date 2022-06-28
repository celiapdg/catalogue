package com.tsys.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tsys.models.Movie;
import com.tsys.repositories.MovieRepository;

@RestController
@CrossOrigin
@RequestMapping("/movie")
public class MovieController {
	
	@Autowired
	MovieRepository movieRepository;
	
	@GetMapping("/") 
	public List<Movie> getMovies() {
		return movieRepository.findAll();
	}
	
	@GetMapping("/{id}") 
	public Movie getMovie(@PathVariable Integer id) {
		return movieRepository.findById(id).get();
	}
	
}

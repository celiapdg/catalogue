package com.tsys.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tsys.models.Movie;
import com.tsys.repositories.MovieRepository;

public class MovieService {

	@Autowired
	MovieRepository movieRepository;
	
	public List<Movie> getStars() {
		return movieRepository.findAll();
	}
	
	public Optional<Movie> getStar(Integer id) {
		return movieRepository.findById(id);
	}
	
}

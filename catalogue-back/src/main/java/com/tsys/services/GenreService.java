package com.tsys.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsys.models.Genre;
import com.tsys.repositories.GenreRepository;

@Service
public class GenreService {

	@Autowired
	GenreRepository genreRepository;
	
	public Optional<Genre> getGenre(Integer id) {
		return genreRepository.findById(id);
	}
}
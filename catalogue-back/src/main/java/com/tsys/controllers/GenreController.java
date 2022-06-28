package com.tsys.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tsys.models.Genre;
import com.tsys.services.GenreService;

@RestController
@RequestMapping("/genre")
public class GenreController {
	
	@Autowired
	GenreService genreService;
	
	@GetMapping("/{id}") @CrossOrigin
	public ResponseEntity<Genre> getGenre(@PathVariable Integer id) {
		Optional<Genre> opt = genreService.getGenre(id);
		if (opt.isEmpty()) return ResponseEntity.notFound().build();
		return ResponseEntity.ok().body(opt.get());
	}
}

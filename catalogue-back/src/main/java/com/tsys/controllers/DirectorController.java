package com.tsys.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tsys.models.Director;
import com.tsys.services.DirectorService;

@RestController
@RequestMapping("/director")
public class DirectorController {

	@Autowired
	DirectorService directorService;
	
	@GetMapping("/{id}") @CrossOrigin
	public ResponseEntity<Director> getDirector(@PathVariable Integer id) {
		Optional<Director> opt = directorService.getDirector(id);
		if (opt.isEmpty()) return ResponseEntity.notFound().build();
		return ResponseEntity.ok().body(opt.get());
	}
}

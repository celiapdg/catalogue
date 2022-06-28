package com.tsys.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tsys.models.Star;
import com.tsys.services.StarService;

@RestController
@CrossOrigin
@RequestMapping("/star")
public class StarController {

	@Autowired
	StarService starService;
	
	@GetMapping("/") 
	public List<Star> getStars() {
		return starService.getStars();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Star> getStar(@PathVariable Integer id) {
		Optional<Star> opt = starService.getStar(id);
		if (opt.isEmpty()) return ResponseEntity.notFound().build();
		return ResponseEntity.ok().body(opt.get());
	}
}

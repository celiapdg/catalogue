package com.tsys.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsys.models.Star;
import com.tsys.repositories.StarRepository;

@Service
public class StarService {

	@Autowired
	StarRepository starRepository;
	
	public List<Star> getStars() {
		return starRepository.findAll();
	}
	
	public Optional<Star> getStar(Integer id) {
		return starRepository.findById(id);
	}
}

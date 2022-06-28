package com.tsys.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsys.models.Director;
import com.tsys.repositories.DirectorRepository;

@Service
public class DirectorService {

	@Autowired
	DirectorRepository directorRepository;
	
	public Optional<Director> getDirector(Integer id) {
		return directorRepository.findById(id);
	}
	
}

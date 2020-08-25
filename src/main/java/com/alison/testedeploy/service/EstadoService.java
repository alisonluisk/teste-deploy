package com.alison.testedeploy.service;

import com.alison.testedeploy.domain.Estado;
import com.alison.testedeploy.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoService {
	
	@Autowired
	private EstadoRepository repo;
	
	public Estado find(Long id) {
		Optional<Estado> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrato! Id: " + id));
	}
	
	public List<Estado> findAll() {
		return repo.findAll();
	}
}

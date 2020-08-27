package com.alison.testedeploy.resource;

import com.alison.testedeploy.domain.Estado;
import com.alison.testedeploy.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/estados")
public class EstadoResource {

	@Autowired
	private EstadoService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Estado>> findAll() {
		List<Estado> list = service.findAll();
		return ResponseEntity.ok().body(list.subList(0,5));
	}
	
}

/**
 * 
 */
package com.asa.atom.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asa.atom.model.Element;
import com.asa.atom.service.PeriodicTableService;

import lombok.AllArgsConstructor;

/**
 * 
 */
@RestController
@RequestMapping("api/v1/elements")
@AllArgsConstructor
public class ElementsPeriodicTableApi {
	
	private PeriodicTableService service;
	
	@GetMapping
	public ResponseEntity<List<Element>> getElments() {
		return ResponseEntity.ok().body(service.getPeriodicTable());
	}

}

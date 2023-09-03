/**
 * 
 */
package com.asa.atom.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.asa.atom.model.Element;
import com.asa.atom.repository.PeriodicTableRepository;

import lombok.AllArgsConstructor;

/**
 * 
 */
@Service
@AllArgsConstructor
public class PeriodicTableServiceImpl implements PeriodicTableService {
	
	private PeriodicTableRepository repository;

	@Override
	public List<Element> getPeriodicTable() {
		return repository.getPeriodicTable();
	}

}

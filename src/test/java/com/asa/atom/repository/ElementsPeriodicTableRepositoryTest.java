/**
 * 
 */
package com.asa.atom.repository;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.asa.atom.model.Element;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 */
@Slf4j
class ElementsPeriodicTableRepositoryTest {
	
	

	@Test
	void testGetPeriodicTable() {
		List<Element> result = new PeriodicTableRepositoryImpl().getPeriodicTable();
		//assertEquals(Elements.values().length, result.size());
		
		for(Element e: result) {
			log.info(e.toString());
		}
	}

}

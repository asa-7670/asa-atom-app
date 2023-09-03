/**
 * 
 */
package com.asa.atom.repository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Repository;

import com.asa.atom.model.Element;
import com.asa.atom.util.CsvFileDataUtils;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 */
@Repository
@Slf4j
public class PeriodicTableRepositoryImpl implements PeriodicTableRepository {
	
	@Value("classpath:data/periodic_table_elements.csv")
	private Resource resource;
	
	@Override
	public List<Element> getPeriodicTable() {
		List<Element> result = new ArrayList<Element>();
		
		List<String[]> records;
		try {
			records = CsvFileDataUtils.readCsvFile(resource.getFile());
			for(String[] values: records) {
				result.add(getElement(values));
			}
		} catch (IOException e) {
			log.error(e.getMessage());
		}		
		return result;		
	}
	
	private Element getElement(String[] values) {
		return Element.builder()
				.atomicNumber(getInteger(values[0]))	
				.name(values[1])
				.symbol(values[2])
				.atomicMass(getDouble(values[3]))
				.numberOfNeutrons(getInteger(values[4]))
				.numberOfProtons(getInteger(values[5]))
				.numberOfElectrons(getInteger(values[6]))
				.period(getInteger(values[7]))
				.group(getInteger(values[8]))
				.phase(values[9])
				.radioactive(values[10])
				.natural(values[11])
				.type(values[12])
				.atomicRadius(values[13])
				.electronegativity(getDouble(values[14]))
				.firstIonization(getDouble(values[15]))
				.density(getDouble(values[16]))
				.meltingPoint(getDouble(values[17]))
				.boilingPoint(getDouble(values[18]))
				.numberOfIsotopes(getInteger(values[19]))
				.descoverer(values[20])
				.year(getInteger(values[21]))
				.specificHeat(getDouble(values[22]))
				.numberOfShells(getInteger(values[23]))
				.numberOfValence(getInteger(values[24]))
				.build();
	}
	
	private Double getDouble(String value) {
		if(value != null && !value.isEmpty()) {
			return Double.valueOf(value);
		}
		return null;
	}
	
	private Integer getInteger(String value) {
		if(value != null && !value.isEmpty()) {
			return Integer.valueOf(value);
		}
		return null;
	}

}

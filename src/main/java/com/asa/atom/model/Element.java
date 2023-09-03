/**
 * 
 */
package com.asa.atom.model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

/**
 * @author asa
 *
 */
@Getter
@Builder
@ToString
public class Element {
	
	private final Integer atomicNumber;
	private final String name;
	private final String symbol;
	private final Double atomicMass;
	private final Integer numberOfNeutrons;
	private final Integer numberOfProtons;
	private final Integer numberOfElectrons;
	private final Integer period;
	private final Integer group;
	private final String phase; 
	private final String radioactive;
	private final String natural;
	private final String type;
	private final String atomicRadius;
	private final Double electronegativity;
	private final Double firstIonization;
	private final Double density;
	private final Double meltingPoint;
	private final Double boilingPoint;
	private final Integer numberOfIsotopes;
	private final String descoverer;
	private final Integer year;
	private final Double specificHeat;
	private final Integer numberOfShells;
	private final Integer numberOfValence;
}

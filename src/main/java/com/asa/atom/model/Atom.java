package com.asa.atom.model;

import com.asa.atom.constant.MeasureUnit;
import com.asa.atom.model.particle.Electron;
import com.asa.atom.util.AbstractAtom;

import lombok.Getter;

/**
 * @author asa
 *
 */
@Getter
public class Atom extends AbstractAtom {
	
	private final String name;
	private final  String symbol;
	private final Nucleus nucleus;
	private final Electron [] electrons;
	
	public Atom(String name, String symbol, int nbrProton, int nbrNeutron, int nbrElecton) {
		super();
		this.name = name;
		this.symbol = symbol;
		this.nucleus = new Nucleus(nbrProton, nbrNeutron);
		this.electrons = getElectrons(nbrElecton);
	}	
	
	@Override
	public double getMassAtomic() {
		double value =  this.nucleus.getMass();
		for(Electron e: this.electrons) {
			value +=e.getMass();
		}
		return value / MeasureUnit.MASS_UNIT;
	}

	@Override
	public int getAtomicNumber() {		
		return this.nucleus.getProtons().length;
	}	

	private Electron[] getElectrons(int size) {
		Electron[] result = new Electron[size];
		for(int i=0;i<size;i++) {
			result[i]=new Electron();
		}
		return result;
	}	
	
}

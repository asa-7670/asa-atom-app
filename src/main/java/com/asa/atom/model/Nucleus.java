/**
 * 
 */
package com.asa.atom.model;

import com.asa.atom.model.particle.Neutron;
import com.asa.atom.model.particle.Proton;
import com.asa.atom.util.AbstractParticle;

import lombok.Getter;

/**
 * @author asa
 *
 */
public class Nucleus extends AbstractParticle {	
	
	@Getter
	private final Proton[] protons;
	@Getter
	private final Neutron[] neutrons;
	
	public Nucleus(int protons, int neutrons) {
		super();
		this.protons = getProtons(protons);
		this.neutrons = getNeutrons(neutrons);		
	}
	
	@Override
	public double getMass() {
		double value = 0;
		for(Proton p: this.protons) {
			value +=p.getMass();
		}
		for(Neutron n: this.neutrons) {
			value +=n.getMass();
		}
		return value;
	}
	@Override
	public double getCharge() {
		double value = 0;
		for(Proton p: this.protons) {
			value +=p.getCharge();
		}
		return value;
	}
	@Override
	public int getSpin() {
		// TODO Auto-generated method stub
		return 0;
	}	

	private Proton[] getProtons(int size) {
		Proton[] result = new Proton[size];
		for(int i=0;i < size; i++) {
			result[i] = new Proton();
		}
		return result;
	}
	
	private Neutron[] getNeutrons(int size) {
		Neutron[] result = new Neutron[size];
		for(int i=0;i<size; i++) {
			result[i]=new Neutron();
		}
		return result;
	}	

}

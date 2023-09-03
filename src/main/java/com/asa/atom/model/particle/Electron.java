/**
 * 
 */
package com.asa.atom.model.particle;

import com.asa.atom.constant.MeasureUnit;
import com.asa.atom.util.AbstractParticle;

/**
 * @author asa
 *
 */
public class Electron extends AbstractParticle {
	
	/**
	 * Mass in KG
	 */
	public double getMass() {		
		return MeasureUnit.MASS_ELECTRON;
	}
	/**
	 * Charge in Coulomb
	 */
	public double getCharge() {
		return  -1 * getCharge();
	}

	public int getSpin() {
		//TODO
		return 0;
	}

}

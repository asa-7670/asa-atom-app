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
public class Neutron extends AbstractParticle{
	
	/**
	 * Mass in KG
	 */
	public double getMass() {
		return MeasureUnit.MASS_NEUTRON;
	}
	/**
	 * Charge Coulumb
	 */
	public double getCharge() {
		return 0;
	}

	public int getSpin() {
		// TODO
		return 0;
	}

}

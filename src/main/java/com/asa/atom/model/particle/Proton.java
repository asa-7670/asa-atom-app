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
public class Proton extends AbstractParticle {	
	
	/**
	 * Mass in KG
	 */
	public double getMass() {		
		return MeasureUnit.MASS_PROTON;
	}

	public int getSpin() {
		// TODO
		return 0;
	}

}

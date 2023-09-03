/**
 * 
 */
package com.asa.atom.util;

import com.asa.atom.constant.MeasureUnit;

/**
 * @author asa
 *
 */
public abstract class AbstractParticle {
	
	public abstract double getMass();
	public double getCharge() {
		return MeasureUnit.CHARGE_UNIT;
	}
	public abstract int getSpin();

}

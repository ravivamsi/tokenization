/**
 * 
 */
package com.devasset.card.util;

import com.devasset.card.model.Algorithms;
import com.devasset.card.model.Tier;

/**
 * @author vamsir
 *
 */
public class TierAlgorithmMapper {

	public static Boolean validate(Tier tier, Algorithms algorithm) {

		if ((tier.equals(Tier.FREE) && algorithm.equals(Algorithms.BASIC)) || (tier.equals(Tier.ENTERPRISE))) {
			return true;
		} else {
			return false;
		}

	}

}

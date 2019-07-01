/**
 * 
 */
package com.devasset.card.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author vamsir
 *
 */
public class AccountCreateRequest {

	@JsonProperty
	public Algorithms algorithm = null;

	@JsonProperty
	public Tier tier = null;

	/**
	 * @return the algorithm
	 */
	public Algorithms getAlgorithm() {
		return algorithm;
	}

	/**
	 * @param algorithm the algorithm to set
	 */
	public void setAlgorithm(Algorithms algorithm) {
		this.algorithm = algorithm;
	}

	/**
	 * @return the tier
	 */
	public Tier getTier() {
		return tier;
	}

	/**
	 * @param tier the tier to set
	 */
	public void setTier(Tier tier) {
		this.tier = tier;
	}

}

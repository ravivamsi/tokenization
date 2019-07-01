/**
 * 
 */
package com.devasset.card.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author vamsir
 *
 */
public enum Tier {

	FREE("FREE"), ENTERPRISE("ENTERPRISE");

	private String tier;

	Tier(String tier) {
		this.tier = tier;
	}

	public String getTier() {
		return tier;
	}

	private static final List<Tier> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
	private static final int SIZE = VALUES.size();
	private static final Random RANDOM = new Random();

	public static Tier randomTier() {
		return VALUES.get(RANDOM.nextInt(SIZE));
	}

}

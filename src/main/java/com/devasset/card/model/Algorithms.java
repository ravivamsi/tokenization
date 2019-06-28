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
public enum Algorithms {

	SHA("SHA"), CUSTOM("CUSTOM");

	private String algorithm;

	Algorithms(String algorithm) {
		this.algorithm = algorithm;
	}

	public String getAlgorithm() {
		return algorithm;
	}

	private static final List<Algorithms> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
	private static final int SIZE = VALUES.size();
	private static final Random RANDOM = new Random();

	public static Algorithms randomLetter() {
		return VALUES.get(RANDOM.nextInt(SIZE));
	}

}

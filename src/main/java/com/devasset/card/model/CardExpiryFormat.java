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
public enum CardExpiryFormat {

	MMYY("MMYY"), MMYYYY("MMYYY");

	private String format;

	CardExpiryFormat(String format) {
		this.format = format;
	}

	public String getCardExpiryFormat() {
		return format;
	}

	private static final List<CardExpiryFormat> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
	private static final int SIZE = VALUES.size();
	private static final Random RANDOM = new Random();

	public static CardExpiryFormat randomLetter() {
		return VALUES.get(RANDOM.nextInt(SIZE));
	}

}

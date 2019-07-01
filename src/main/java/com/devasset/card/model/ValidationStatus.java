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
public enum ValidationStatus {

	SUCCESS("SUCCESS"), FAIL("FAIL");

	private String validationstatus;

	ValidationStatus(String validationstatus) {
		this.validationstatus = validationstatus;
	}

	public String getValidationStatus() {
		return validationstatus;
	}

	private static final List<ValidationStatus> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
	private static final int SIZE = VALUES.size();
	private static final Random RANDOM = new Random();

	public static ValidationStatus randomLetter() {
		return VALUES.get(RANDOM.nextInt(SIZE));
	}

}

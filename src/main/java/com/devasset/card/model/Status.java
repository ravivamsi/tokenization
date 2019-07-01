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
public enum Status {

	ACTIVE("ACTIVE"), INACTIVE("INACTIVE");

	private String status;

	Status(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	private static final List<Status> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
	private static final int SIZE = VALUES.size();
	private static final Random RANDOM = new Random();

	public static Status randomLetter() {
		return VALUES.get(RANDOM.nextInt(SIZE));
	}
}

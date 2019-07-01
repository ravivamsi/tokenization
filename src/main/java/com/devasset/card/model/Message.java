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
public enum Message {

	CREATED("CREATED"), NOTCREATED("NOTCREATED");

	private String message;

	Message(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	private static final List<Message> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
	private static final int SIZE = VALUES.size();
	private static final Random RANDOM = new Random();

	public static Message randomLetter() {
		return VALUES.get(RANDOM.nextInt(SIZE));
	}
}

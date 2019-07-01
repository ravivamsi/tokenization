/**
 * 
 */
package com.devasset.card.util;

import com.devasset.card.model.Algorithms;

/**
 * @author vamsir
 *
 */
public class AuthenticationKey {

	public static Boolean validate(String authkey) {
//		TODO
//		Call DB to check if the authkey is valid
		String dbauthkey = "abc";

		if (authkey.equals(dbauthkey)) {
			return true;
		} else {
			return false;
		}
	}

	public static Integer getAlgorithmInteger(String authkey) {

//		Call DB with the AuthKey
//		TODO

		return 0;

	}

	public static Algorithms getAlgorithmEnum(Integer integer) {

//		TODO

		return Algorithms.RANDBIN;

	}

}

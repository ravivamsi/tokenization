/**
 * 
 */
package com.devasset.card.util;

import com.devasset.card.model.Algorithms;
import com.devasset.card.model.TokenizeRequest;
import com.devasset.card.model.TokenizeResponse;
import com.devasset.card.model.ValidationStatus;

/**
 * @author vamsir
 *
 */
public class Tokenizer {

	public static TokenizeResponse process(TokenizeRequest tokenizeRequest) {

		TokenizeResponse tokenizeResponse = new TokenizeResponse();

		if (tokenizeRequest.getAlgorithm().equals(Algorithms.SHA)) {
//			TODO
			tokenizeResponse.setCreditcardtoken("");

		} else if (tokenizeRequest.getAlgorithm().equals(Algorithms.CUSTOM)) {
//			TODO
			tokenizeResponse.setCreditcardtoken("");
		} else {

		}

		tokenizeResponse.setValidationstatus(ValidationStatus.SUCCESS);

		return tokenizeResponse;

	}

	public static TokenizeResponse reject() {

		TokenizeResponse tokenizeResponse = new TokenizeResponse();

//		TODO

		tokenizeResponse.setValidationstatus(ValidationStatus.FAIL);
		tokenizeResponse.setCreditcardtoken("");

		return tokenizeResponse;
	}
}

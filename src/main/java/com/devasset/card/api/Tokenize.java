/**
 * 
 */
package com.devasset.card.api;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devasset.card.model.TokenizeRequest;
import com.devasset.card.model.TokenizeResponse;
import com.devasset.card.util.AuthenticationKey;
import com.devasset.card.util.Tokenizer;

/**
 * @author vamsir
 *
 */
@RestController
public class Tokenize {

	@RequestMapping(value = "tokenize", method = RequestMethod.POST)
	public ResponseEntity<TokenizeResponse> healthCheck(@Valid @RequestBody TokenizeRequest tokenizeRequest) {

		TokenizeResponse tokenizeResponse = new TokenizeResponse();
		if (AuthenticationKey.validate(tokenizeRequest.getAuthkey())) {
			tokenizeResponse = Tokenizer.process(tokenizeRequest);
			return ResponseEntity.ok().body(tokenizeResponse);
		} else {
			tokenizeResponse = Tokenizer.reject();
			return ResponseEntity.badRequest().body(tokenizeResponse);
		}

	}

}

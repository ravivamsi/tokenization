/**
 * 
 */
package com.devasset.card.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devasset.card.model.DetokenizeRequest;
import com.devasset.card.model.DetokenizeResponse;
import com.devasset.card.util.Detokenizer;

/**
 * @author vamsir
 *
 */
@RestController
public class Detokenize {
	
	@RequestMapping(value = "detokenize", method = RequestMethod.POST)
	public ResponseEntity<DetokenizeResponse> healthCheck(@RequestBody DetokenizeRequest detokenizeRequest) {
		
		return ResponseEntity.ok().body(Detokenizer.process(detokenizeRequest));
		
	}

}

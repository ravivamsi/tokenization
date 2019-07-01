/**
 * 
 */
package com.devasset.card.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devasset.card.model.HealthCheck;

/**
 * @author vamsir
 *
 */

@RestController
public class ReadinessCheck {

	@RequestMapping(value = "healthcheck", method = RequestMethod.GET)
	public ResponseEntity<HealthCheck> healthCheck() {

		HealthCheck healthCheck = new HealthCheck();

		healthCheck.setStatus("active");

		return ResponseEntity.ok().body(healthCheck);

	}

}

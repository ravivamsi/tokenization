/**
 * 
 */
package com.devasset.card.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author vamsir
 *
 */
public class DetokenizeRequest {

	@JsonProperty
	public String authkey = null;

	@JsonProperty
	public String creditcardtoken = null;

	@JsonProperty
	public Algorithms algorithm = null;

}

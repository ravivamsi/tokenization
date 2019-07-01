/**
 * 
 */
package com.devasset.card.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author vamsir
 *
 */

public class DetokenizeResponse {

	@JsonProperty
	public String creditcardnumber = null;

	@JsonProperty
	public String cardexpiry = null;

	@JsonProperty
	public CardExpiryFormat cardexpiryformat = null;

}

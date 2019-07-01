/**
 * 
 */
package com.devasset.card.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author vamsir
 *
 */
public class TokenizeResponse {

	@JsonProperty
	public String creditcardtoken = null;

	@JsonProperty
	public ValidationStatus validationstatus = null;

	/**
	 * @return the creditcardtoken
	 */
	public String getCreditcardtoken() {
		return creditcardtoken;
	}

	/**
	 * @param creditcardtoken the creditcardtoken to set
	 */
	public void setCreditcardtoken(String creditcardtoken) {
		this.creditcardtoken = creditcardtoken;
	}

	/**
	 * @return the validationstatus
	 */
	public ValidationStatus getValidationstatus() {
		return validationstatus;
	}

	/**
	 * @param validationstatus the validationstatus to set
	 */
	public void setValidationstatus(ValidationStatus validationstatus) {
		this.validationstatus = validationstatus;
	}

}

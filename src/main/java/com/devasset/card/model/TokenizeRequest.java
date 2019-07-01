/**
 * 
 */
package com.devasset.card.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author vamsir
 *
 */
public class TokenizeRequest {

	@JsonProperty
	public String authkey = null;

	@JsonProperty
	public String creditcardnumber = null;

	@JsonProperty
	public String cardexpiry = null;

	@JsonProperty
	public CardExpiryFormat cardexpiryformat = null;

	@JsonProperty
	public Algorithms algorithm = null;

	/**
	 * @return the authkey
	 */
	public String getAuthkey() {
		return authkey;
	}

	/**
	 * @param authkey the authkey to set
	 */
	public void setAuthkey(String authkey) {
		this.authkey = authkey;
	}

	/**
	 * @return the creditcardnumber
	 */
	public String getCreditcardnumber() {
		return creditcardnumber;
	}

	/**
	 * @param creditcardnumber the creditcardnumber to set
	 */
	public void setCreditcardnumber(String creditcardnumber) {
		this.creditcardnumber = creditcardnumber;
	}

	/**
	 * @return the cardexpiry
	 */
	public String getCardexpiry() {
		return cardexpiry;
	}

	/**
	 * @param cardexpiry the cardexpiry to set
	 */
	public void setCardexpiry(String cardexpiry) {
		this.cardexpiry = cardexpiry;
	}

	/**
	 * @return the cardexpiryformat
	 */
	public CardExpiryFormat getCardexpiryformat() {
		return cardexpiryformat;
	}

	/**
	 * @param cardexpiryformat the cardexpiryformat to set
	 */
	public void setCardexpiryformat(CardExpiryFormat cardexpiryformat) {
		this.cardexpiryformat = cardexpiryformat;
	}

	/**
	 * @return the algorithm
	 */
	public Algorithms getAlgorithm() {
		return algorithm;
	}

	/**
	 * @param algorithm the algorithm to set
	 */
	public void setAlgorithm(Algorithms algorithm) {
		this.algorithm = algorithm;
	}

}

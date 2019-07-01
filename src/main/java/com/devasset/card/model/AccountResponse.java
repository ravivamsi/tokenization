/**
 * 
 */
package com.devasset.card.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author vamsir
 *
 */
public class AccountResponse {

	@JsonProperty
	public String _id = null;

	@JsonProperty
	public String authkey = null;

	@JsonProperty
	public Algorithms algorithm = null;

	@JsonProperty
	public Tier tier = null;

	@JsonProperty
	public Message message = null;

	@JsonProperty
	public Status status = null;

	/**
	 * @return the message
	 */
	public Message getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(Message message) {
		this.message = message;
	}

	/**
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Status status) {
		this.status = status;
	}

	/**
	 * @return the _id
	 */
	public String get_id() {
		return _id;
	}

	/**
	 * @param _id the _id to set
	 */
	public void set_id(String _id) {
		this._id = _id;
	}

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

	/**
	 * @return the tier
	 */
	public Tier getTier() {
		return tier;
	}

	/**
	 * @param tier the tier to set
	 */
	public void setTier(Tier tier) {
		this.tier = tier;
	}

}

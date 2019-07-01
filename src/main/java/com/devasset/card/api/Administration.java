/**
 * 
 */
package com.devasset.card.api;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devasset.card.model.AccountCreateRequest;
import com.devasset.card.model.AccountResponse;
import com.devasset.card.model.CreatedAccountResponse;
import com.devasset.card.model.Message;
import com.devasset.card.model.Status;
import com.devasset.card.util.TierAlgorithmMapper;

/**
 * @author vamsir
 *
 */
@RestController
public class Administration {

	@RequestMapping(value = "account", method = RequestMethod.POST)
	public ResponseEntity<CreatedAccountResponse> healthCheck(
			@Valid @RequestBody AccountCreateRequest accountCreateRequest) {
		CreatedAccountResponse createdAccountResponse = new CreatedAccountResponse();

		String accountId = UUID.randomUUID().toString();
		String authkey = UUID.randomUUID().toString() + UUID.randomUUID().toString();

		if (TierAlgorithmMapper.validate(accountCreateRequest.getTier(), accountCreateRequest.getAlgorithm())) {

			/*
			 * TODO Create Record in Database
			 */

			createdAccountResponse.set_id(accountId);
			createdAccountResponse.setAuthkey(authkey);
			createdAccountResponse.setStatus(Status.ACTIVE);
			createdAccountResponse.setMessage(Message.CREATED);

		} else {

			createdAccountResponse.set_id("");
			createdAccountResponse.setAuthkey("");
			createdAccountResponse.setStatus(Status.INACTIVE);
			createdAccountResponse.setMessage(Message.NOTCREATED);

		}

		return ResponseEntity.ok().body(createdAccountResponse);

	}

	@RequestMapping(value = "account/{id}", method = RequestMethod.GET)
	public ResponseEntity<AccountResponse> getAccountByAccountId(@PathVariable String accountId) {
		AccountResponse accountResponse = new AccountResponse();

		/*
		 * Retrieve Data with Account ID
		 */

		return ResponseEntity.ok().body(accountResponse);

	}

	@RequestMapping(value = "authkey/{authkey}", method = RequestMethod.GET)
	public ResponseEntity<AccountResponse> getAccountByAuthKey(@PathVariable String authkey) {
		AccountResponse accountResponse = new AccountResponse();

		/*
		 * Retrieve Data with AuthKey
		 */

		return ResponseEntity.ok().body(accountResponse);

	}

}

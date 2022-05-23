package com.raj.gcp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raj.gcp.api.UserResponse;

@Validated
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

	Logger LOG = LoggerFactory.getLogger(UserController.class);

	@GetMapping
	public UserResponse getUser() throws Exception {

		LOG.info("Enter into UserController::getUser");

		UserResponse userResponse = new UserResponse();
		userResponse.setUserName("my test username");
		LOG.info("Exit from serController::getUser");
		return userResponse;

	}

}

package it.objectmethod.cloudide.restcontoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.cloudide.domain.User;
import it.objectmethod.cloudide.repository.UserRepository;

@RestController
public class LoginRestController {

	@Autowired
	private UserRepository userRepository;

	@CrossOrigin
	@PostMapping("/login")
	public String login(@RequestParam(value = "userName", required = true) String userName,
			@RequestParam(value = "password", required = true) String password) {

		String message = "no";

		User user = null;
		user = userRepository.findUserByUsernameAndPassword(userName, password);
		if (user != null) {
			message = "ok";
		}

		return message;
	}

}

package it.objectmethod.cloudide.restcontoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.cloudide.domain.User;
import it.objectmethod.cloudide.repository.UserRepository;

@RestController
public class UserRestController {

	@Autowired
	private UserRepository userRepository;
	
	@CrossOrigin
	@GetMapping("/getUser")
	public User getUser(@RequestParam("id") Long id) {

		User user = userRepository.findUserNameById(id);
		return user;
	}

}

package it.objectmethod.cloudide.restcontoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.cloudide.domain.view.UserRegistry;
import it.objectmethod.cloudide.domain.UserRegistryParameterFilter;
import it.objectmethod.cloudide.repository.view.UserRegistryRepository;

@RestController
public class UserRegistryRestController {

	@Autowired
	private UserRegistryRepository userRegistryRepository;

	@CrossOrigin
	@PostMapping("/getUsersRegistryFilter")
	public List<UserRegistry> getUsersRegistryFilter(@RequestBody UserRegistryParameterFilter params) {

		System.out.println(params);

		if (params.getUnb() == null || params.getUnb().equals("")) {
			params.setUnb("%");
		}
		if (params.getUnbDescription() == null || params.getUnbDescription().equals("")) {
			params.setUnbDescription("%");
		}
		if (params.getPartitaIva() == null || params.getPartitaIva().equals("")) {
			params.setPartitaIva("%");
		}
		if (params.getCompanyName() == null || params.getCompanyName().equals("")) {
			params.setCompanyName("%");
		}
		if (params.getUserName() == null || params.getUserName().equals("")) {
			params.setUserName("%");
		}
		if (params.getIdRole() == null || params.getIdRole().equals("")) {
			params.setIdRole("%");
		}

		List<UserRegistry> usersRegistry = null;

		usersRegistry = userRegistryRepository.findUserRegistryForFilter(params.getUnb(), params.getUnbDescription(),
				params.getCompanyName(), params.getUserName(), params.getIdRole());

		System.out.println("numero di elementi -> " + usersRegistry.size());

		return usersRegistry;
	}

}

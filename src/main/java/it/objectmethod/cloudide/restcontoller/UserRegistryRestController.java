package it.objectmethod.cloudide.restcontoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.cloudide.domain.view.UserRegistry;
import it.objectmethod.cloudide.repository.view.UserRegistryRepository;

@RestController
public class UserRegistryRestController {

	@Autowired
	private UserRegistryRepository userRegistryRepository;

	@CrossOrigin
	@GetMapping("/getAllUserRegistry")
	public List<UserRegistry> getAllUserRegistry() {

		List<UserRegistry> usersRegistry = null;
		usersRegistry = userRegistryRepository.findAll();

		return usersRegistry;
	}

	@CrossOrigin
	@GetMapping("/getUsersRegistryFilter")
	public List<UserRegistry> getUsersRegistryFilter(@RequestParam(value = "unb", required = false) String unb,
			@RequestParam(value = "unbDesc", required = false) String unbDesc,
			@RequestParam(value = "partitaIva", required = false) String partitaIva,
			@RequestParam(value = "companyName", required = false) String companyName,
			@RequestParam(value = "userName", required = false) String userName,
			@RequestParam(value = "rule", required = false) String rule) {
		
		if(unb==null) {unb="%";} //else {System.out.println(unb);}
		if(unbDesc==null) {unbDesc="%";}
		if(partitaIva==null) {partitaIva="%";}
		if(companyName==null) {companyName="%";}
		if(userName==null) {userName="%";}
		if(rule==null) {rule="%";}
		
		List<UserRegistry> usersRegistry = null;

		usersRegistry = userRegistryRepository.findUserRegistryForFilter(unb, unbDesc, companyName, userName, rule);
		
		System.out.println("numero di elementi -> "+usersRegistry.size());
		
		return usersRegistry;
	}

}

package it.objectmethod.cloudide.repository.view;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import it.objectmethod.cloudide.domain.view.UserRegistry;

@Repository
public interface UserRegistryRepository extends JpaRepository<UserRegistry, Long> {

	@Query(value = "SELECT ur FROM UserRegistry ur  WHERE ur.unb LIKE ?1% AND ur.unbDescription LIKE ?2% AND ur.companyName LIKE ?3% AND ur.userName LIKE ?4% AND ur.idRole LIKE ?5%")
	public List<UserRegistry> findUserRegistryForFilter(String unb, String unbDesc, String companyName, String userName,
			String rule);

}

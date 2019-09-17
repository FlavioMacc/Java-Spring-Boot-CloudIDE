package it.objectmethod.cloudide.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import it.objectmethod.cloudide.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	@Query(value="select u from User u where u.userId = ?1")
	public User findUserNameById(Long id);
	
	/*@Query(value="select USERS.COMPANY_NAME,USERS.USER_NAME,USERS.PROFILE,USERS.ID_ROLE,UNB.UNB,UNB.UNB_DESCRIPTION from USERS INNER JOIN UNB ON USERS.USER_ID = UNB.USER_ID")
	public User findAllRegistryUser();*/

}

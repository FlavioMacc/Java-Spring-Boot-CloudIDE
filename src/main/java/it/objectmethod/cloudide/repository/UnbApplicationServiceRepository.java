package it.objectmethod.cloudide.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import it.objectmethod.cloudide.domain.UnbApplicationService;

@Repository
public interface UnbApplicationServiceRepository extends JpaRepository<UnbApplicationService, Long> {
	
}

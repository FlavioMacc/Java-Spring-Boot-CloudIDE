package it.objectmethod.cloudide.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import it.objectmethod.cloudide.domain.SimpleService;

@Repository
public interface SimpleServiceRepository extends JpaRepository<SimpleService, Long> {
	
}

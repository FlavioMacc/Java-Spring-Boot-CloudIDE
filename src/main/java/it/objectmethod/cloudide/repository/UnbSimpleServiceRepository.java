package it.objectmethod.cloudide.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import it.objectmethod.cloudide.domain.UnbSimpleService;

@Repository
public interface UnbSimpleServiceRepository extends JpaRepository<UnbSimpleService, Long> {
	
}

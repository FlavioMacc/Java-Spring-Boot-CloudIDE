package it.objectmethod.cloudide.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import it.objectmethod.cloudide.domain.DocumentService;

@Repository
public interface DocumentServiceRepository extends JpaRepository<DocumentService, Long> {
	
}

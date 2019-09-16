package it.objectmethod.cloudide.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import it.objectmethod.cloudide.domain.UnbDocumentsService;

@Repository
public interface UnbDocumentServiceRepository extends JpaRepository<UnbDocumentsService, Long> {
	
}

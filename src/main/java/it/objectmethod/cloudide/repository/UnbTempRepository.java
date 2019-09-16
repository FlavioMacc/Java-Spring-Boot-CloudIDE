package it.objectmethod.cloudide.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import it.objectmethod.cloudide.domain.UnbTemp;

@Repository
public interface UnbTempRepository extends JpaRepository<UnbTemp, Long> {
	
}

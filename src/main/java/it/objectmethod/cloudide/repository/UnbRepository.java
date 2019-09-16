package it.objectmethod.cloudide.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import it.objectmethod.cloudide.domain.Unb;

@Repository
public interface UnbRepository extends JpaRepository<Unb, Long> {
	
}

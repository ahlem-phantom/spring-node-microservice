package tn.esprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entities.Contrat;

@Repository
public interface ContratRepository extends JpaRepository<Contrat, Long> {
    Contrat findOneById(Long contratid);
}

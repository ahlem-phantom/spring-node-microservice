package tn.esprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.entities.Conge;

@Repository
public interface CongeRepository extends JpaRepository<Conge, Integer>{
    Conge findOneById(int id);

    
}

package tn.esprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.entities.JobApplicant;

@Repository
public interface JobApplicantRepository extends JpaRepository<JobApplicant, Long>{
    JobApplicant findOneById(Long id);
}

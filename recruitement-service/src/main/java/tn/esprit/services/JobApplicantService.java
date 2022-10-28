package tn.esprit.services;

import java.util.List;
import tn.esprit.entities.JobApplicant;

public interface JobApplicantService {

	public void addJobApplicant(JobApplicant JobApplicant);

    public List<JobApplicant> findAllJobApplicants();

    public void deleteJobApplicant(Long id);

    public JobApplicant findJobApplicant(Long id);

    public void updateJobApplicant(JobApplicant JobApplicant) ;
    
}

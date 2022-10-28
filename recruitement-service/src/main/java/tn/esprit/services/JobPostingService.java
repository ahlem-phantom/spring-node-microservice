package tn.esprit.services;

import java.util.List;
import tn.esprit.entities.JobPosting;


public interface JobPostingService {

	public void addJobPosting(JobPosting JobPosting);

    public List<JobPosting> findAllJobPostings();

    public void deleteJobPosting(Long id);

    public JobPosting findJobPosting(Long id);

    public void updateJobPosting(JobPosting JobPosting) ;

    
}

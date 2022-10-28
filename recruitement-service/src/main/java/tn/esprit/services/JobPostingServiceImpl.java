package tn.esprit.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.entities.JobPosting;
import tn.esprit.repositories.JobPostingRepository;



@Service
public class JobPostingServiceImpl implements JobPostingService{

    @Autowired
    JobPostingRepository postingRepository;

    @Override
    public void addJobPosting(JobPosting jobPosting) {
        postingRepository.save(jobPosting);
        
    }

    @Override
    public List<JobPosting> findAllJobPostings() {
        return postingRepository.findAll();

    }

    @Override
    public void deleteJobPosting(Long id) {
        if(postingRepository.findById(id).isPresent()){
            postingRepository.deleteById(id);
          }
          else {
            System.out.println("No Posting with id "+id+" exists !!!");
          }        
    }

    @Override
    public JobPosting findJobPosting(Long id) {
        return postingRepository.findOneById(id);

    }

    @Override
    public void updateJobPosting(JobPosting jobPosting) {
        postingRepository.save(jobPosting);    
    }   
}

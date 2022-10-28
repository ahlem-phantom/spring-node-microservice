package tn.esprit.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.entities.JobApplicant;
import tn.esprit.repositories.JobApplicantRepository;

@Service
public class JobApplicantServiceImpl implements JobApplicantService{

    @Autowired
    JobApplicantRepository applicantRepository;


    @Override
    public void addJobApplicant(JobApplicant jobApplicant) {
        applicantRepository.save(jobApplicant);
    }

    @Override
    public List<JobApplicant> findAllJobApplicants() {
        return applicantRepository.findAll();
    }

    @Override
    public void deleteJobApplicant(Long id) {
        if(applicantRepository.findById(id).isPresent()){
            applicantRepository.deleteById(id);
          }
          else {
            System.out.println("No Applicant with id "+id+" exists !!!");
      
          }   
    }

    @Override
    public JobApplicant findJobApplicant(Long id) {
        return applicantRepository.findOneById(id);

    }

    @Override
    public void updateJobApplicant(JobApplicant jobApplicant) {
        applicantRepository.save(jobApplicant);    
    }
    
}

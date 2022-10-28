package tn.esprit.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.entities.JobApplicant;
import tn.esprit.services.JobApplicantService;


@RestController
public class JobApplicantApi {

    @Autowired
	JobApplicantService jobApplicantService;

    @GetMapping("/")
    public String index() {
        return "Recruitement Service is running";
    }
    @PostMapping("/add-applicant")
    public void addApplicant(@RequestBody JobApplicant applicant) {
        jobApplicantService.addJobApplicant(applicant);
    }
    @DeleteMapping(value="/delete-applicant/{id}")
    public void deleteApplicant(@PathVariable Long id) {
        jobApplicantService.deleteJobApplicant(id);
    }
    @GetMapping("/all-applicants")
    public List<JobApplicant> getAllJobApplicants() {
        return jobApplicantService.findAllJobApplicants();
    }
    @GetMapping("/get-applicant/{id}")
    public JobApplicant getJobApplicant(@PathVariable Long id) {
        return jobApplicantService.findJobApplicant(id);
    }

    @PutMapping("/update-applicant")
    public void updateApplicant(@RequestBody JobApplicant applicant){
        jobApplicantService.updateJobApplicant(applicant);
    }

}

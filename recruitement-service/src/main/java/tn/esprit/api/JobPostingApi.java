package tn.esprit.api;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.esprit.entities.JobPosting;
import tn.esprit.services.JobPostingService;



@RestController
public class JobPostingApi {

    @Autowired
	JobPostingService jobPostingService;

    @PostMapping("/add-posting")
    public void addJobPosting(@RequestBody JobPosting posting) {
        jobPostingService.addJobPosting(posting);
    }
    @DeleteMapping(value="/delete-posting/{id}")
    public void deletePosting(@PathVariable Long id) {
        jobPostingService.deleteJobPosting(id);
    }
    @GetMapping("/all-postings")
    public List<JobPosting> getAllJobPostings() {
        return jobPostingService.findAllJobPostings();
    }
    @GetMapping("/get-posting/{id}")
    public JobPosting getJobPosting(@PathVariable Long id) {
        return jobPostingService.findJobPosting(id);
    }

    @PutMapping("/update-posting")
    public void updatePosting(@RequestBody JobPosting posting){
        jobPostingService.updateJobPosting(posting);
    }

}

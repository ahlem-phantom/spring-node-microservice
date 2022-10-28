package tn.esprit.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "job-postings")
public class JobPosting{

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "minSalary")
	private int minSalary;

	@Column(name = "maxSalary")
	private int maxSalary;

	@Column(name = "applicationStatus")
	private ApplicantStatus applicationStatus;
	
	@Column(name = "jobDescription")
	private String jobDescription;

	@Column(name = "noOfOpenings")
	private String noOfOpenings;

	@Column(name = "contractType")
	private String contractType;

	@Column(name = "contractPeriod")
	private int contractPeriod;

	
}

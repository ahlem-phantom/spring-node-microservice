package tn.esprit.entities;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "positions")
public class Position {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

	@Column(name = "designation")
    private String designation;

    
	@Column(name = "departmentName")
    private String departmentName;

	@Column(name = "startDate")
    private Date startDate;

	@Column(name = "endDate")
    private Date endDate;

	@Column(name = "employeeId")
    private Long employeeId;

   
}
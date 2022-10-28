package tn.esprit.services;

import java.util.List;
import tn.esprit.entities.Department;


public interface DepartmentService {

	public void addDepartment(Department department);

    public List<Department> findAllDepartments();

    public void deleteDepartment(Long id);

    public Department findDepartment(Long id);

    public void updateDepartment(Department department) ;
    
}




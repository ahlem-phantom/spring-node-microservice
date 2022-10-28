package tn.esprit.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entities.Department;
import tn.esprit.repositories.DepartmentRepository;


@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
	private DepartmentRepository departmentRepository;

    @Override
    public void addDepartment(Department department) {
        departmentRepository.save(department);  
    }

    @Override
    public List<Department> findAllDepartments() {
        return departmentRepository.findAll();

    }

    @Override
    public void deleteDepartment(Long id) {
        if(departmentRepository.findById(id).isPresent()){
            departmentRepository.deleteById(id);
          }
          else {
            System.out.println("No Departement with id "+id+" exists !!!");
          }        
        
    }

    @Override
    public Department findDepartment(Long id) {
        return departmentRepository.findOneById(id);

    }

    @Override
    public void updateDepartment(Department department) {
        departmentRepository.save(department);        
    }

   
    
}

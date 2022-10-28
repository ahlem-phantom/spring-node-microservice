package tn.esprit.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.entities.Department;
import tn.esprit.services.DepartmentService;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@RestController
public class DepartmentApi {

    @Autowired
	private DepartmentService departmentService;

    @PostMapping("/add-department")
    public void addDepartment(@RequestBody Department department) {
        departmentService.addDepartment(department);
    }
    @DeleteMapping(value="/delete-department/{id}")
    public void deleteDepartment(@PathVariable Long id) {
        departmentService.deleteDepartment(id);
    }
    @GetMapping("/all-departments")
    public List<Department> getAllDepartments() {
        return departmentService.findAllDepartments();
    }
    @GetMapping("/get-department/{id}")
    public Department getDepartment(@PathVariable Long id) {
        return departmentService.findDepartment(id);
    }

    @PutMapping("/update-department")
    public void updateDepartment(@RequestBody Department department){
        departmentService.updateDepartment(department);
    }
    
}

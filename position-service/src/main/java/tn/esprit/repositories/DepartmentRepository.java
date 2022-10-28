package tn.esprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.entities.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Department findOneById(Long id);
}

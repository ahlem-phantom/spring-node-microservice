package tn.esprit.repositories;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.entities.Employee;

import java.util.List;

@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {

	Employee findOneById(Long id);
	@Query(value ="select * from Employee where lower(nom) like lower(concat('%',:filter,'%'))" +
			" or " +
			" lower(email) like lower(concat('%',:filter,'%'))" +
			" or " +
			" lower(prenom) like lower(concat('%',:filter,'%'))" +
			"or " +
			"DATE_NAISSANCE like concat('%',:filter,'%')",nativeQuery = true)
	List<Employee> findAll(@Param("filter")String filter, Pageable pageable);
}

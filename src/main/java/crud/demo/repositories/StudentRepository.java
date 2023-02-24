package crud.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import crud.demo.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}

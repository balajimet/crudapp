package crud.demo;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import crud.demo.entities.Student;
import crud.demo.repositories.StudentRepository;

@SpringBootTest
class CruddemoApplicationTests {

	@Autowired
	private StudentRepository studentRepo;

	@Test
	void saveOneStudent() {

		Student s = new Student();

		s.setName("stallin");
		s.setCourse("testing");
		s.setFee(4000);

		studentRepo.save(s);

	}

	@Test
	void deleteOneStudent() {

		studentRepo.deleteById(10L);
	}
	
	@Test
	void getOneStudent() {

		Optional<Student> findById = studentRepo.findById(1L);
		Student student = findById.get();
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getCourse());
		System.out.println(student.getFee());
	}
	
	
	@Test
	void updateOneStudent() {

		Student s = new Student();
        
		s.setId(10);
		s.setName("stallin s");
		s.setCourse("testing");
		s.setFee(10000);

		studentRepo.save(s);

	}
	

}

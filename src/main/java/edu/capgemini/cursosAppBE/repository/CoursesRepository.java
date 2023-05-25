package edu.capgemini.cursosAppBE.repository;

import edu.capgemini.cursosAppBE.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CoursesRepository extends JpaRepository<Course, Long> {

}

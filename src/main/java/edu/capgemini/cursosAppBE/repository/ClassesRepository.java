package edu.capgemini.cursosAppBE.repository;

import edu.capgemini.cursosAppBE.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CoursesRepository extends JpaRepository<Course, Long> {

    //CREATE
    void createCourse();

    //READ
    Course findCourseById(Long courseId){
        Course course = new Course();


        return course;
    };

    Course findCourseByName(String className);

    List<Course> findCoursesByProfessorId();

    List<Course> findCoursesByStudentId();

    //UPDATE
    void updateCourseById();

    //DELETE
    void deleteCourseById();

}

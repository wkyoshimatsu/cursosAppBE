package edu.capgemini.cursosAppBE.controller;

import edu.capgemini.cursosAppBE.model.Course;
import edu.capgemini.cursosAppBE.repository.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CoursesController {

    @Autowired
    CoursesRepository coursesRepository;

    //CREATE
    @PostMapping("/courses")
    public ResponseEntity<Course> createCourse (@RequestBody Course course){

    }

    //READ
    @GetMapping("/courses")
    public ResponseEntity<Course> getAllCourses(@RequestParam(required = false) String term){

    }

    @GetMapping("/courses/{courseId}")
    public ResponseEntity<Course> getCourseById(@PathVariable("courseId") long courseId){

    }

    @GetMapping("/courses/{professorId}")
    public ResponseEntity<Course> getCourseByProfessorId(@PathVariable("professorId") long professorId){

    }

    @GetMapping("/courses/{studentId}")
    public ResponseEntity<Course> getCourseByStudentId(@PathVariable("studentId") String studentId){
        return
    }

    //UPDATE
    @PutMapping("/courses/{courseId}")
    public ResponseEntity<Course> updateCourseById(@PathVariable("courseId") long courseId){

    }

    //DELETE
    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourseById(@PathVariable("courseId") long courseId){

    }
}

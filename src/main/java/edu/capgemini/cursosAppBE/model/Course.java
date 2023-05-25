package edu.capgemini.cursosAppBE.model;

import jakarta.persistence.*;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    private long courseId;

    @Column(name = "courseName")
    private String courseName;

    @Column(name = "courseDescription")
    private String courseDescription;

    @Column(name = "courseProfessorId")
    private long courseProfessorId;

    public Course(String courseName, String courseDescription, long courseProfessorId) {
        setCourseName(courseName);
        setCourseDescription(courseDescription);
        setCourseProfessorId(courseProfessorId);
    }

    public Course() {
    }

    public long getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public long getCourseProfessorId() {
        return courseProfessorId;
    }

    public void setCourseProfessorId(long courseProfessorId) {
        this.courseProfessorId = courseProfessorId;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + this.getCourseId() +
                ", courseName='" + this.getCourseName() + '\'' +
                ", courseDescription='" + this.getCourseDescription() + '\'' +
                ", courseProfessorId=" + getCourseProfessorId() +
                '}';
    }
}


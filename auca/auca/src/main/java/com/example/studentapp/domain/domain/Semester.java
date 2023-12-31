package com.example.studentapp.domain.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;


import java.util.List;

@Entity
@Table(name = "semesters")
public class Semester {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int semid;
    @Column(name="Sem_name")
    private String name;
    @Column(name="Sem_startdate")
    private String startdate;
    @Column(name="Sem_enddate")
    private String enddate;
    @OneToMany(mappedBy = "sem")
    @JsonManagedReference("semesterRegistrationReference")
    private List<StudentRegistration> reg;
    @OneToMany(mappedBy = "sems")
    @JsonManagedReference("semesterCourseReference")
    private List<Course> course;

    public Semester() {
    }

    public Semester(int semid) {
        this.semid = semid;
    }

    public Semester(int semid, String name, String startdate, String enddate, List<StudentRegistration> reg, List<Course> course) {
        this.semid = semid;
        this.name = name;
        this.startdate = startdate;
        this.enddate = enddate;
        this.reg = reg;
        this.course = course;
    }

    public int getSemid() {
        return semid;
    }

    public void setSemid(int semid) {
        this.semid = semid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public List<StudentRegistration> getReg() {
        return reg;
    }

    public void setReg(List<StudentRegistration> reg) {
        this.reg = reg;
    }

    public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Semester{" +
                "semid=" + semid +
                ", name='" + name + '\'' +
                ", startdate=" + startdate +
                ", enddate=" + enddate +
                ", reg=" + reg +
                ", course=" + course +
                '}';
    }
}

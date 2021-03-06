package com.gradezilla.dao.entity;
// Generated Oct 6, 2015 7:42:06 PM by Hibernate Tools 3.2.2.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

/**
 * Semester generated by hbm2java
 */
@Entity
@Table(name="Semester"
    ,schema="dbo"
    ,catalog="SchoolApp"
)
public class Semester  implements java.io.Serializable {


     private int semesterId;
     private String semesterName;
     private int semesterYear;
     private Date semesterStartDate;
     private Date semesterEndDate;
     private Set<Grade> grades = new HashSet<Grade>(0);
     private Set<CoursePeriod> coursePeriods = new HashSet<CoursePeriod>(0);
     private Set<CoursePeriod> coursePeriods_1 = new HashSet<CoursePeriod>(0);
     private Set<Grade> grades_1 = new HashSet<Grade>(0);

    public Semester() {
    }

	
    public Semester(int semesterId, String semesterName, int semesterYear, Date semesterStartDate, Date semesterEndDate) {
        this.semesterId = semesterId;
        this.semesterName = semesterName;
        this.semesterYear = semesterYear;
        this.semesterStartDate = semesterStartDate;
        this.semesterEndDate = semesterEndDate;
    }
    public Semester(int semesterId, String semesterName, int semesterYear, Date semesterStartDate, Date semesterEndDate, Set<Grade> grades, Set<CoursePeriod> coursePeriods, Set<CoursePeriod> coursePeriods_1, Set<Grade> grades_1) {
       this.semesterId = semesterId;
       this.semesterName = semesterName;
       this.semesterYear = semesterYear;
       this.semesterStartDate = semesterStartDate;
       this.semesterEndDate = semesterEndDate;
       this.grades = grades;
       this.coursePeriods = coursePeriods;
       this.coursePeriods_1 = coursePeriods_1;
       this.grades_1 = grades_1;
    }
   
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="semesterId", unique=true, nullable=false)
    public int getSemesterId() {
        return this.semesterId;
    }
    
    public void setSemesterId(int semesterId) {
        this.semesterId = semesterId;
    }
    
    @Column(name="semesterName", nullable=false, length=50)
    public String getSemesterName() {
        return this.semesterName;
    }
    
    public void setSemesterName(String semesterName) {
        this.semesterName = semesterName;
    }
    
    @Column(name="semesterYear", nullable=false)
    public int getSemesterYear() {
        return this.semesterYear;
    }
    
    public void setSemesterYear(int semesterYear) {
        this.semesterYear = semesterYear;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="semesterStartDate", nullable=false, length=10)
    public Date getSemesterStartDate() {
        return this.semesterStartDate;
    }
    
    public void setSemesterStartDate(Date semesterStartDate) {
        this.semesterStartDate = semesterStartDate;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="semesterEndDate", nullable=false, length=10)
    public Date getSemesterEndDate() {
        return this.semesterEndDate;
    }
    
    public void setSemesterEndDate(Date semesterEndDate) {
        this.semesterEndDate = semesterEndDate;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="semester")
    public Set<Grade> getGrades() {
        return this.grades;
    }
    
    public void setGrades(Set<Grade> grades) {
        this.grades = grades;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="semester")
    public Set<CoursePeriod> getCoursePeriods() {
        return this.coursePeriods;
    }
    
    public void setCoursePeriods(Set<CoursePeriod> coursePeriods) {
        this.coursePeriods = coursePeriods;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="semester")
    public Set<CoursePeriod> getCoursePeriods_1() {
        return this.coursePeriods_1;
    }
    
    public void setCoursePeriods_1(Set<CoursePeriod> coursePeriods_1) {
        this.coursePeriods_1 = coursePeriods_1;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="semester")
    public Set<Grade> getGrades_1() {
        return this.grades_1;
    }
    
    public void setGrades_1(Set<Grade> grades_1) {
        this.grades_1 = grades_1;
    }




}



package com.gradezilla.dao.entity;
// Generated Oct 6, 2015 7:42:06 PM by Hibernate Tools 3.2.2.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Department generated by hbm2java
 */
@Entity
@Table(name="Department"
    ,schema="dbo"
    ,catalog="SchoolApp"
)
public class Department  implements java.io.Serializable {


     private int departmentId;
     private School school;
     private String departmentName;
     private String departmentDescription;
     private Set<Course> courses = new HashSet<Course>(0);
     private Set<Course> courses_1 = new HashSet<Course>(0);

    public Department() {
    }

	
    public Department(int departmentId, School school, String departmentName, String departmentDescription) {
        this.departmentId = departmentId;
        this.school = school;
        this.departmentName = departmentName;
        this.departmentDescription = departmentDescription;
    }
    public Department(int departmentId, School school, String departmentName, String departmentDescription, Set<Course> courses, Set<Course> courses_1) {
       this.departmentId = departmentId;
       this.school = school;
       this.departmentName = departmentName;
       this.departmentDescription = departmentDescription;
       this.courses = courses;
       this.courses_1 = courses_1;
    }
   
     @Id 
    
    @Column(name="departmentId", unique=true, nullable=false)
    public int getDepartmentId() {
        return this.departmentId;
    }
    
    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="schoolId", nullable=false)
    public School getSchool() {
        return this.school;
    }
    
    public void setSchool(School school) {
        this.school = school;
    }
    
    @Column(name="departmentName", nullable=false, length=50)
    public String getDepartmentName() {
        return this.departmentName;
    }
    
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    
    @Column(name="departmentDescription", nullable=false, length=50)
    public String getDepartmentDescription() {
        return this.departmentDescription;
    }
    
    public void setDepartmentDescription(String departmentDescription) {
        this.departmentDescription = departmentDescription;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="department")
    public Set<Course> getCourses() {
        return this.courses;
    }
    
    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="department")
    public Set<Course> getCourses_1() {
        return this.courses_1;
    }
    
    public void setCourses_1(Set<Course> courses_1) {
        this.courses_1 = courses_1;
    }




}



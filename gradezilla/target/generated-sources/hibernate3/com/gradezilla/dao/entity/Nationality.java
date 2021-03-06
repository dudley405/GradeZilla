package com.gradezilla.dao.entity;
// Generated Oct 6, 2015 7:42:06 PM by Hibernate Tools 3.2.2.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

/**
 * Nationality generated by hbm2java
 */
@Entity
@Table(name="Nationality"
    ,schema="dbo"
    ,catalog="SchoolApp"
)
public class Nationality  implements java.io.Serializable {


     private int nationalityId;
     private String nationalityName;
     private String nationalityDescription;
     private Set<Student> students = new HashSet<Student>(0);
     private Set<Student> students_1 = new HashSet<Student>(0);

    public Nationality() {
    }

	
    public Nationality(int nationalityId, String nationalityName) {
        this.nationalityId = nationalityId;
        this.nationalityName = nationalityName;
    }
    public Nationality(int nationalityId, String nationalityName, String nationalityDescription, Set<Student> students, Set<Student> students_1) {
       this.nationalityId = nationalityId;
       this.nationalityName = nationalityName;
       this.nationalityDescription = nationalityDescription;
       this.students = students;
       this.students_1 = students_1;
    }
   
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="nationalityId", unique=true, nullable=false)
    public int getNationalityId() {
        return this.nationalityId;
    }
    
    public void setNationalityId(int nationalityId) {
        this.nationalityId = nationalityId;
    }
    
    @Column(name="nationalityName", nullable=false, length=50)
    public String getNationalityName() {
        return this.nationalityName;
    }
    
    public void setNationalityName(String nationalityName) {
        this.nationalityName = nationalityName;
    }
    
    @Column(name="nationalityDescription")
    public String getNationalityDescription() {
        return this.nationalityDescription;
    }
    
    public void setNationalityDescription(String nationalityDescription) {
        this.nationalityDescription = nationalityDescription;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="nationality")
    public Set<Student> getStudents() {
        return this.students;
    }
    
    public void setStudents(Set<Student> students) {
        this.students = students;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="nationality")
    public Set<Student> getStudents_1() {
        return this.students_1;
    }
    
    public void setStudents_1(Set<Student> students_1) {
        this.students_1 = students_1;
    }




}



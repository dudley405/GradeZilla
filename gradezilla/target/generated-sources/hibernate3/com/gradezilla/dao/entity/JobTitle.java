package com.gradezilla.dao.entity;
// Generated Oct 6, 2015 7:42:06 PM by Hibernate Tools 3.2.2.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * JobTitle generated by hbm2java
 */
@Entity
@Table(name="JobTitle"
    ,schema="dbo"
    ,catalog="SchoolApp"
)
public class JobTitle  implements java.io.Serializable {


     private int jobTitleId;
     private String jobTitleName;
     private String jobTitleDescription;
     private Set<Employees> employeeses = new HashSet<Employees>(0);
     private Set<Employees> employeeses_1 = new HashSet<Employees>(0);

    public JobTitle() {
    }

	
    public JobTitle(int jobTitleId, String jobTitleName, String jobTitleDescription) {
        this.jobTitleId = jobTitleId;
        this.jobTitleName = jobTitleName;
        this.jobTitleDescription = jobTitleDescription;
    }
    public JobTitle(int jobTitleId, String jobTitleName, String jobTitleDescription, Set<Employees> employeeses, Set<Employees> employeeses_1) {
       this.jobTitleId = jobTitleId;
       this.jobTitleName = jobTitleName;
       this.jobTitleDescription = jobTitleDescription;
       this.employeeses = employeeses;
       this.employeeses_1 = employeeses_1;
    }
   
     @Id 
    
    @Column(name="jobTitleId", unique=true, nullable=false)
    public int getJobTitleId() {
        return this.jobTitleId;
    }
    
    public void setJobTitleId(int jobTitleId) {
        this.jobTitleId = jobTitleId;
    }
    
    @Column(name="jobTitleName", nullable=false, length=50)
    public String getJobTitleName() {
        return this.jobTitleName;
    }
    
    public void setJobTitleName(String jobTitleName) {
        this.jobTitleName = jobTitleName;
    }
    
    @Column(name="jobTitleDescription", nullable=false, length=50)
    public String getJobTitleDescription() {
        return this.jobTitleDescription;
    }
    
    public void setJobTitleDescription(String jobTitleDescription) {
        this.jobTitleDescription = jobTitleDescription;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="jobTitle")
    public Set<Employees> getEmployeeses() {
        return this.employeeses;
    }
    
    public void setEmployeeses(Set<Employees> employeeses) {
        this.employeeses = employeeses;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="jobTitle")
    public Set<Employees> getEmployeeses_1() {
        return this.employeeses_1;
    }
    
    public void setEmployeeses_1(Set<Employees> employeeses_1) {
        this.employeeses_1 = employeeses_1;
    }




}


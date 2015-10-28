package com.gradezilla.dao.entity;
// Generated Oct 6, 2015 7:42:06 PM by Hibernate Tools 3.2.2.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

/**
 * AppUser generated by hbm2java
 */
@Entity
@Table(name="AppUser"
    ,schema="dbo"
    ,catalog="SchoolApp"
)
public class AppUser  implements java.io.Serializable {


     private int userId;
     private String userEmail;
     private String userPassword;
     private Integer userFailedLoginAttempts;
     private Integer userActive;
     private Set<UserRole> userRoles = new HashSet<UserRole>(0);

    public AppUser() {
    }

	
    public AppUser(int userId) {
        this.userId = userId;
    }
    public AppUser(int userId, String userEmail, String userPassword, Integer userFailedLoginAttempts, Integer userActive, Set<UserRole> userRoles) {
       this.userId = userId;
       this.userEmail = userEmail;
       this.userPassword = userPassword;
       this.userFailedLoginAttempts = userFailedLoginAttempts;
       this.userActive = userActive;
       this.userRoles = userRoles;
    }
   
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="userId", unique=true, nullable=false)
    public int getUserId() {
        return this.userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    @Column(name="userEmail", length=50)
    public String getUserEmail() {
        return this.userEmail;
    }
    
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    
    @Column(name="userPassword", length=50)
    public String getUserPassword() {
        return this.userPassword;
    }
    
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    
    @Column(name="userFailedLoginAttempts")
    public Integer getUserFailedLoginAttempts() {
        return this.userFailedLoginAttempts;
    }
    
    public void setUserFailedLoginAttempts(Integer userFailedLoginAttempts) {
        this.userFailedLoginAttempts = userFailedLoginAttempts;
    }
    
    @Column(name="UserActive")
    public Integer getUserActive() {
        return this.userActive;
    }
    
    public void setUserActive(Integer userActive) {
        this.userActive = userActive;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="appUser")
    public Set<UserRole> getUserRoles() {
        return this.userRoles;
    }
    
    public void setUserRoles(Set<UserRole> userRoles) {
        this.userRoles = userRoles;
    }




}



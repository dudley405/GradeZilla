package com.gradezilla.dao.entity;
// Generated Oct 6, 2015 7:42:06 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * StudentSchedule generated by hbm2java
 */
@Entity
@Table(name="StudentSchedule"
    ,schema="dbo"
    ,catalog="SchoolApp"
)
public class StudentSchedule  implements java.io.Serializable {


     private int studentScheduleId;
     private CoursePeriod coursePeriodByCoursePeriod8;
     private CoursePeriod coursePeriodByCoursePeriod7;
     private Student student;
     private CoursePeriod coursePeriodByCoursePeriod2;
     private CoursePeriod coursePeriodByCoursePeriod1;
     private CoursePeriod coursePeriodByCoursePeriod6;
     private CoursePeriod coursePeriodByCoursePeriod5;
     private CoursePeriod coursePeriodByCoursePeriod4;
     private CoursePeriod coursePeriodByCoursePeriod3;

    public StudentSchedule() {
    }

	
    public StudentSchedule(int studentScheduleId, Student student) {
        this.studentScheduleId = studentScheduleId;
        this.student = student;
    }
    public StudentSchedule(int studentScheduleId, CoursePeriod coursePeriodByCoursePeriod8, CoursePeriod coursePeriodByCoursePeriod7, Student student, CoursePeriod coursePeriodByCoursePeriod2, CoursePeriod coursePeriodByCoursePeriod1, CoursePeriod coursePeriodByCoursePeriod6, CoursePeriod coursePeriodByCoursePeriod5, CoursePeriod coursePeriodByCoursePeriod4, CoursePeriod coursePeriodByCoursePeriod3) {
       this.studentScheduleId = studentScheduleId;
       this.coursePeriodByCoursePeriod8 = coursePeriodByCoursePeriod8;
       this.coursePeriodByCoursePeriod7 = coursePeriodByCoursePeriod7;
       this.student = student;
       this.coursePeriodByCoursePeriod2 = coursePeriodByCoursePeriod2;
       this.coursePeriodByCoursePeriod1 = coursePeriodByCoursePeriod1;
       this.coursePeriodByCoursePeriod6 = coursePeriodByCoursePeriod6;
       this.coursePeriodByCoursePeriod5 = coursePeriodByCoursePeriod5;
       this.coursePeriodByCoursePeriod4 = coursePeriodByCoursePeriod4;
       this.coursePeriodByCoursePeriod3 = coursePeriodByCoursePeriod3;
    }
   
     @Id 
    
    @Column(name="studentScheduleId", unique=true, nullable=false)
    public int getStudentScheduleId() {
        return this.studentScheduleId;
    }
    
    public void setStudentScheduleId(int studentScheduleId) {
        this.studentScheduleId = studentScheduleId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="coursePeriod8")
    public CoursePeriod getCoursePeriodByCoursePeriod8() {
        return this.coursePeriodByCoursePeriod8;
    }
    
    public void setCoursePeriodByCoursePeriod8(CoursePeriod coursePeriodByCoursePeriod8) {
        this.coursePeriodByCoursePeriod8 = coursePeriodByCoursePeriod8;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="coursePeriod7")
    public CoursePeriod getCoursePeriodByCoursePeriod7() {
        return this.coursePeriodByCoursePeriod7;
    }
    
    public void setCoursePeriodByCoursePeriod7(CoursePeriod coursePeriodByCoursePeriod7) {
        this.coursePeriodByCoursePeriod7 = coursePeriodByCoursePeriod7;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="studentId", nullable=false)
    public Student getStudent() {
        return this.student;
    }
    
    public void setStudent(Student student) {
        this.student = student;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="coursePeriod2")
    public CoursePeriod getCoursePeriodByCoursePeriod2() {
        return this.coursePeriodByCoursePeriod2;
    }
    
    public void setCoursePeriodByCoursePeriod2(CoursePeriod coursePeriodByCoursePeriod2) {
        this.coursePeriodByCoursePeriod2 = coursePeriodByCoursePeriod2;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="coursePeriod1")
    public CoursePeriod getCoursePeriodByCoursePeriod1() {
        return this.coursePeriodByCoursePeriod1;
    }
    
    public void setCoursePeriodByCoursePeriod1(CoursePeriod coursePeriodByCoursePeriod1) {
        this.coursePeriodByCoursePeriod1 = coursePeriodByCoursePeriod1;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="coursePeriod6")
    public CoursePeriod getCoursePeriodByCoursePeriod6() {
        return this.coursePeriodByCoursePeriod6;
    }
    
    public void setCoursePeriodByCoursePeriod6(CoursePeriod coursePeriodByCoursePeriod6) {
        this.coursePeriodByCoursePeriod6 = coursePeriodByCoursePeriod6;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="coursePeriod5")
    public CoursePeriod getCoursePeriodByCoursePeriod5() {
        return this.coursePeriodByCoursePeriod5;
    }
    
    public void setCoursePeriodByCoursePeriod5(CoursePeriod coursePeriodByCoursePeriod5) {
        this.coursePeriodByCoursePeriod5 = coursePeriodByCoursePeriod5;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="coursePeriod4")
    public CoursePeriod getCoursePeriodByCoursePeriod4() {
        return this.coursePeriodByCoursePeriod4;
    }
    
    public void setCoursePeriodByCoursePeriod4(CoursePeriod coursePeriodByCoursePeriod4) {
        this.coursePeriodByCoursePeriod4 = coursePeriodByCoursePeriod4;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="coursePeriod3")
    public CoursePeriod getCoursePeriodByCoursePeriod3() {
        return this.coursePeriodByCoursePeriod3;
    }
    
    public void setCoursePeriodByCoursePeriod3(CoursePeriod coursePeriodByCoursePeriod3) {
        this.coursePeriodByCoursePeriod3 = coursePeriodByCoursePeriod3;
    }




}


package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name="STUDENT_INFO")
@Data
@AllArgsConstructor
@Builder
public class Student 
{
	
      @Id
      @GeneratedValue
	  private Long studentId ;
      
      @Column(name ="FIRST_NAME")
	  private String firstName;
      
      @Column(name ="LAST_NAME")
	  private String lastName;
      
      @Column(name ="EMAIL_ID")
	  private String emailId;
      
      @Column(name ="GAURDIAN_NAME")
	  private String guardianName;
      
      @Column(name ="GAURDIAN_EMAIL_ID")
	  private String gaurdianEmailId;
	  
	  
	  

}

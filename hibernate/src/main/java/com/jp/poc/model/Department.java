
package com.jp.poc.model;

import java.util.Collections;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
@Entity
@Data
@DynamicUpdate(value= true)
public class Department {

	@Column(name= "NAME")
	@JsonProperty("name")
    private String name;
    
	@Id
	@GeneratedValue
	@Column(name = "DEPT_ID")
	@JsonProperty("deptId")
    private Long deptId;
    
	@OneToMany( cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name  = "DEPT_ID")
	@JsonProperty("students")
    private List<Student> students = Collections.emptyList();
	
//	@Column(name = "COURSE_ID", nullable= false,insertable= false, updatable = false)
//	@JsonProperty("courseId")
//	private Long courseId;

}

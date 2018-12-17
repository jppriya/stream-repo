
package com.jp.poc.model;

import java.util.Collections;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
@Entity
@Data
@DynamicUpdate(value= true)
@DynamicInsert(value= true)
public class Course {

	@Id
	@GeneratedValue
	@Column(name = "COURSE_ID")
	@JsonProperty("courseId")
	private Long courseId;
	
	@Column(name = "COURSE_NAME")
	@JsonProperty("name")
    private String name;
	
	@OneToMany(fetch = FetchType.LAZY , cascade ={ CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "COURSE_ID", nullable= false)
	@JsonProperty("departments")
    private List<Department> departments = Collections.emptyList();


}

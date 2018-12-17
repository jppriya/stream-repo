
package com.jp.poc.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Entity
@Data
public class College {

	@Id
	@GeneratedValue
	@Column(name = "COLLEGE_ID")
	@JsonProperty("collegeId")
	private Long collegeId;

	@Column(name = "COLLEGE_NAME")
	@JsonProperty("name")
	private String name;

	@JsonProperty("courses")
	@OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "COLLEGE_ID")
	private List<Course> courses = null;

	/*@JsonProperty("courses")
	public List<Course> getCourses() {
		return courses;
	}

	@JsonProperty("courses")
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}*/

}


package com.jp.poc.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Department {

    @JsonProperty("name")
    private String name;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("students")
    private List<Student> students = null;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("students")
    public List<Student> getStudents() {
        return students;
    }

    @JsonProperty("students")
    public void setStudents(List<Student> students) {
        this.students = students;
    }

}

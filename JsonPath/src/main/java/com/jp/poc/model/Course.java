
package com.jp.poc.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Course {

    @JsonProperty("name")
    private String name;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("departments")
    private List<Department> departments = null;

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

    @JsonProperty("departments")
    public List<Department> getDepartments() {
        return departments;
    }

    @JsonProperty("departments")
    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }


}

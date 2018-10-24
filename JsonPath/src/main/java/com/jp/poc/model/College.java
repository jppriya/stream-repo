
package com.jp.poc.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class College {

    @JsonProperty("courses")
    private List<Course> courses = null;

    @JsonProperty("courses")
    public List<Course> getCourses() {
        return courses;
    }

    @JsonProperty("courses")
    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

}

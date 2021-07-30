package com.goanna.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {

    int age;
    String name;
    int id;

    public Student( @JsonProperty("id") int id, @JsonProperty("name") String name , @JsonProperty("age") int age ) {
        this.age = age;
        this.name = name;
        this.id = id;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

package com.wilow.elasticsearch;

import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.util.Arrays;

//需要注释es的索引和类型
@Document(indexName = "willow",type ="employee" )
public class Employee implements Serializable {

    private Integer id;

    private String firstname;

    private String lastname;

    private Integer age;

    private String about;

    private String[] interests;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String[] getInterests() {
        return interests;
    }

    public void setInterests(String[] interests) {
        this.interests = interests;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", about='" + about + '\'' +
                ", interests=" + Arrays.toString(interests) +
                '}';
    }
}

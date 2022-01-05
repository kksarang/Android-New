package com.example.trogon.Model;

public class CategoryModel {

    private String name;
    private String thumbnail;
    private String number_of_courses;

    public CategoryModel(String name, String thumbnail, String number_of_courses) {
        this.name = name;
        this.thumbnail = thumbnail;
        this.number_of_courses = number_of_courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getNumber_of_courses() {
        return number_of_courses;
    }

    public void setNumber_of_courses(String number_of_courses) {
        this.number_of_courses = number_of_courses;
    }
}

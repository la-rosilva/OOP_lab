package com.course.structure;

public class School extends Building {
    public School(double square_footage, int stories, int bedrooms, int baths, int classrooms, String grade_level){
        super(square_footage,stories);
        this.classrooms=classrooms;
        this.grade_level=grade_level;

    }
    public int classrooms;
    public String grade_level;

}
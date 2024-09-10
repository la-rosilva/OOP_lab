package com.course.structure;


public class Building {
    private double square_footage;
    private int stories;
    public Building(double sf, int st){
        square_footage=sf;
        stories=st;
    }
    public int getStories(){
        return stories;
    }
    public double getSquareFootage(){
        return square_footage;
    }
    public int getstories(){
        return stories;
    }
    public void setStories(int st){
        stories=st;
    }

}





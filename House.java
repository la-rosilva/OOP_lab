package com.course.structure;

public class House extends Building{

    public House(double square_footage, int stories, int bedrooms, int baths) {
        super(square_footage, stories);
        this.bedrooms=bedrooms;
        this.baths=baths;
    }
    private int bedrooms;
    private int baths;

    public int getbedrooms(){
        return bedrooms;

    }
   public void setbedrooms(int x){
        bedrooms=x;
        
   }
   public int getbaths(){
        return baths;
   }
   public void setbaths(int x){
        baths=x;
   }


}
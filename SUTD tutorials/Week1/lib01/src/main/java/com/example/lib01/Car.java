package com.example.lib01;


//OBJECT-ORIENTED PROGRAMMING

public class Car { //public = unrestricted access to this class
    //this is a field aka variable for a class
    //usually private

    private int doors;
    private int wheels;
    private String model;
    private String color;

    public void setModel(String model) {
        //this allows me to refer to the field.
        String validModel = model.toLowerCase();
        if (validModel.equals("version m")) {
            this.model = model;
        } else {
            this.model = "unknown";
        }
    }

    public String getModel() {
        return this.model;
    }




}

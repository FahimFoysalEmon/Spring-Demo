package com.example.springdemo;

public class Triangle {

    private String type;

    private String message;

    public Triangle(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }

//    public void setType(String type) {
//        this.type = type;
//    }

    public void draw() {
        System.out.println(getType()+" is Drawn"+" "+getMessage());
    }

}

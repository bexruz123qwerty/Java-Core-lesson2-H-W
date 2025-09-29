package com.example.lesson3.part1;

public class Rectangle {

    private int length;
    private int width;

    public int calculateSquare(){
        return length * width;
    }

    public int calculatePerimeter(){
        return (length + width)*2;
    }
}

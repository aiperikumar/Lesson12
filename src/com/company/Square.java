package com.company;

public class Square extends Figure{
    int a;

    public Square(String name, int a) {
        super(name);
        this.a = a;
    }

    public int getA() {
        return a;
    }
    public double calculatePerimeter(){
        return 4*a;
    }

    @Override
    public String draw() {
        return "\uD83D\uDFE8";
    }
}

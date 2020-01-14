package com.company;

public class Rectangle extends Figure {
    int a;
    int b;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public Rectangle(String name,int a, int b) {
        super(name);
        this.a = a;
        this.b = b;
    }
    public double calculatePerimeter(){
        return 2*a+2*b;
    }

    @Override
    public String draw() {
        return "\uD83D\uDFE8";
    }
}

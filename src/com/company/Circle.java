package com.company;

public class Circle extends Figure{
    double r ;
    final double pi = 3.14 ;

    public Circle(String name, double r) {
        super(name);
        this.r = r;
    }


    public double  calculatePerimeter(){
        return 2*pi*r;
    }

    @Override
    public String draw() {
        return "⭕";
    }
}

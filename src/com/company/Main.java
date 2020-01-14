package com.company;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle("Круг",6);
        System.out.println("Периметр " + circle.getName() + circle.draw() + " = " + circle.calculatePerimeter());

        Square square =  new Square("Квадрат", 8);
        System.out.println("Периметр " + square.getName() + square.draw()+" = " + square.calculatePerimeter());

        Figure[] figure = new Figure[]{circle, square, new Triangle("Треугольник",2,5,7), new Rectangle("ПРямоугольник",4,5)};

        for (int i = 0; i <figure.length ; i++) {
            System.out.println(figure[i].getName()+figure[i].draw()+ " = "+ figure[i].calculatePerimeter());

        }


    }
}

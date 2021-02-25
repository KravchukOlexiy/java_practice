package ru.stqa.ptf.sandbox;

public class MyFirstProgram {
      public static void main(String[] args) {
           hello("Alexey");

           Square square = new Square(5);
            System.out.println("Площадь квадрата со стороной " + square.l + " = " + square.area());

            Rectangle rectangle = new Rectangle(5,6);
            System.out.println("Площадь прямоугольника со сторонами " + rectangle.a + " и " + rectangle.b + " = " + rectangle.area());
      }

      public static void hello(String name){
            System.out.println("Hello, " + name);
      }
}
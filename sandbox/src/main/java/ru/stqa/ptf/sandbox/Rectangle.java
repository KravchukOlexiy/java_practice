package ru.stqa.ptf.sandbox;

public class Rectangle {
      public double a;
      public double b;

      //создан конструктор класса (псевдофункция)
      public Rectangle (double a, double b) {
            this.a = a;
            this.b = b;
      }

      public double area () {
            return this.a * this.b;
      }
}

package ru.stqa.ptf.sandbox;

public class Square {
      public  double l;

      //создан конструктор класса (псевдофункция)
      public Square (double len) {
            this.l = len;
      }

      public double area ( ) {
            return this.l * this.l;
      }
}

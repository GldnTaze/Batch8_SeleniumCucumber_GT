package com.Java.day39ConstructorAndOOPintro.Odev;

public class Araba {
    //Bır araba classına aıt fielts--> model; make; year;
    // mile; color; yer alıyor. Bu propertiesler ile ile birlikte dört araba objesını  Araçlar  class ında create ediniz
     String model;
     String make;
     int year;
     String color;

    public Araba(String model, String make, int year, String color) {
        this.model = model;
        this.make = make;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';


    }
}

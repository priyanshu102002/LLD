package DesignPatterns.Singelton;

public class Example {
    public static void main(String[] args) {

        Car c1 = Car.obj;
        Car c2 = Car.obj;
        System.out.println(c1 == c2);
    }
}

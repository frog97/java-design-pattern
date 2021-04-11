package com.parkgaram.flyweight;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();

        Flyweight flyweight = flyweightFactory.getFlyweight("A");
        System.out.println(flyweight);
        flyweight = flyweightFactory.getFlyweight("A");
        System.out.println(flyweight);
        flyweight = flyweightFactory.getFlyweight("A");
        System.out.println(flyweight);

        flyweight = flyweightFactory.getFlyweight("B");
        System.out.println(flyweight);
        flyweight = flyweightFactory.getFlyweight("B");
        System.out.println(flyweight);
    }
}

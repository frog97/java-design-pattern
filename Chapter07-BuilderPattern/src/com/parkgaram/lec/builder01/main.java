package com.parkgaram.lec.builder01;

public class main {
    public static void main (String args[])
    {

        // 아래 처럼 만드는 것은 너무 복잡해... 다른 객체에게 생성 넘기면 더 좋아질듯.
        Computer computer = new Computer("i7", "16g", "256");

        ComputerFactory factory = new ComputerFactory();
        factory.setBluePrint(new LgGramBluePrint()); // LgGram대신 Sony, Mac 등일수도 있다.
        computer = factory.makeAndGet(); //or factory.make().get()l; 일수도 있음.

        System.out.println(computer);

    }
}

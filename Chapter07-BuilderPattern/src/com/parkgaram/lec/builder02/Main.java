package com.parkgaram.lec.builder02;

public class Main {
    public static void main(String args[])
    {

        Computer computerold = new Computer("16g", "256g ssd", "i7");
        // 파리미터가 100개 넘어가면 햇갈리기 마련.

        Computer computer = ComputerBuilder
                .start()
                .setCpu("i7")
                .setRam("8g")
                .build();

        System.out.println(computer);


        Computer computer2 = ComputerBuilder
                .startWithCpu("i5")
                .setRam("8g")
                .setStorage("256G ssd")
                .build();

        System.out.println(computer2);
    }
}

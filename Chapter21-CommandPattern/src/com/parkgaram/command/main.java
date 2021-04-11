package com.parkgaram.command;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class main {
    public static void main(String[] args) {

        PriorityQueue<Command> queue = new PriorityQueue<>();
        queue.add(new StringPrintCommand("ABCD"));
        queue.add(new StringPrintCommand("ABC"));
        queue.add(new StringPrintCommand("A"));
        queue.add(new StringPrintCommand("AB"));


        for (Command command : queue)
        {
            command.execute();
        }




        // example 1
        /*
        List<Command> list = new LinkedList<>();
        list.add(new Command() {
            @Override
            public void execute() {
                System.out.println("작업1");
            }
        });
        list.add(new Command() {
            @Override
            public void execute() {
                System.out.println("작업2");
            }
        });
        list.add(new Command() {
            @Override
            public void execute() {
                System.out.println("작업3");
            }
        });

        for (Command com: list) {
            com.execute();

        }
*/
    }
}

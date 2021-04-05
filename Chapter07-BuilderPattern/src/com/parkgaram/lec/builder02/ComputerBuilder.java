package com.parkgaram.lec.builder02;

import com.parkgaram.dp.builder.Builder;

public class ComputerBuilder {
    private Computer computer;

    private ComputerBuilder()
    {
        computer = new Computer("default", "default", "default");
    }

    public static ComputerBuilder start()
    {
        return new ComputerBuilder();
        //return null;
    }

    public static ComputerBuilder startWithCpu(String s)
    {
        return new ComputerBuilder().setCpu(s);
    }

    public ComputerBuilder setCpu(String cpu) {
        computer.setCpu(cpu);
        return this;
    }

    public ComputerBuilder setRam(String s) {
        computer.setRam(s);
        return this;
    }

    public ComputerBuilder setStorage(String s) {
        computer.setStorage(s);
        return this;
    }

    public Computer build() {
        return this.computer;
    }
}

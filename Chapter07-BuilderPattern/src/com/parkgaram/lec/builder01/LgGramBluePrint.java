package com.parkgaram.lec.builder01;

public class LgGramBluePrint extends BluePrint{

    private Computer computer;

    public LgGramBluePrint() {
        this.computer = new Computer("defaut", "defaut", "defaut");
    }

    @Override
    public void setCpu() {
        computer.setCpu("i7");
    }

    @Override
    public void setRam() {
        computer.setRam("8g");
    }

    @Override
    public void setStorage() {
        computer.setStorage("256G ssd");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}

package com.parkgaram.lec.builder01;

public class ComputerFactory {

    private BluePrint bluePrint;

    public void setBluePrint(BluePrint bluePrint) {
        this.bluePrint = bluePrint;
    }

    public Computer makeAndGet() {
        bluePrint.setCpu();
        bluePrint.setRam();
        bluePrint.setStorage();

        return bluePrint.getComputer();
    }


}

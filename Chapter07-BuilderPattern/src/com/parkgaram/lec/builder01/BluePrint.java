package com.parkgaram.lec.builder01;

public abstract class BluePrint {
    public abstract void setCpu();
    public abstract void setRam();
    public abstract void setStorage();

    public abstract Computer getComputer();
}

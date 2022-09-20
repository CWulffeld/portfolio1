package com.company;

public abstract class Vessel {
    String flagNation;
    int aDraft;
    int length;
    int width;

    private int containerLength;
    private int containerWidth;

    public Vessel(){

    }

    public Vessel(String flagNation, int aDraft, int length, int width, int cargo) {
        this.flagNation = flagNation;
        this.aDraft = aDraft;
        this.length = length;
        this.width = width;
        this.cargo = cargo;
    }

    public int getContainerLength() {
        return containerLength;
    }

    public void setContainerLength(int containerLength) {
        this.containerLength = containerLength;
    }

    public int getContainerWidth() {
        return containerWidth;
    }

    public void setContainerWidth(int containerWidth) {
        this.containerWidth = containerWidth;
    }


    public abstract void loadingCargo();


}

package com.workintech.model;

public class Bedroom {
    private String name;
    private Wall Wall1;
    private Wall Wall2;
    private Wall Wall3;
    private Wall Wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;
    private Wardrobe wardrobe;
    private Carpet carpet;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp, Wardrobe wardrobe, Carpet carpet) {
        this.name = name;
        Wall1 = wall1;
        Wall2 = wall2;
        Wall3 = wall3;
        Wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
        this.wardrobe = wardrobe;
        this.carpet = carpet;
    }

    public String getName() {
        return name;
    }

    public Wall getWall1() {
        return Wall1;
    }

    public Wall getWall2() {
        return Wall2;
    }

    public Wall getWall3() {
        return Wall3;
    }

    public Wall getWall4() {
        return Wall4;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Bed getBed() {
        return bed;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Carpet getCarpet() {
        return carpet;
    }
}

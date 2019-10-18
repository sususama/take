package edu.xatu.model;

public class Bomb extends RoadThing {
    private int blooddow;

    public Bomb(int id, int distance, int left, int width, int height, int blooddow,Road road) {
        super(id, distance, left, width, height, road);
        this.blooddow = blooddow;
    }

    public int getBlooddow() {
        return blooddow;
    }
    public void setBlooddow(int blooddow) {
        this.blooddow = blooddow;
    }
}
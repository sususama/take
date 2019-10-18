package edu.xatu.model;

public class BloodUpThing extends RoadThing {
    private int upblood;//增加的血量

    public BloodUpThing(int id, int distance, int left, int width, int height,Road road) {
        super(id, distance, left, width, height,road);
    }

    public int getUpblood() {
        return upblood;
    }

    public void setUpblood(int upblood) {
        this.upblood = upblood;
    }
}

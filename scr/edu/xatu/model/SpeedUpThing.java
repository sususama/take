package edu.xatu.model;

public class SpeedUpThing extends RoadThing {
    private int howmany;
    private int duration;

    public SpeedUpThing(int id, int distance, int left, int width, int height,Road road) {
        super(id, distance, left, width, height, road);
    }

    public int getHowmany() {
        return howmany;
    }
    public void setHowmany(int howmany) {
        this.howmany = howmany;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
}

package edu.xatu.model;

public class Bullet  extends RoadThing{
    private Car car;

    public Bullet(int id, int distance, int left, int width, int height,Road road) {
        super(id, distance, left, width, height, road);
    }

    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        this.car = car;
    }
}

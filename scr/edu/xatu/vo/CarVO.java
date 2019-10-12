package edu.xatu.vo;

import edu.xatu.model.Car;

public class CarVO extends RoadThingVO {
    private int speed;//速度
    private int blood;
    private int acceleration;//车的位置
    private int topSpeed;//最高速度

    public CarVO(Car car) {
        super();
        this.setSpeed(car.getSpeed());
        this.setAcceleration(car.getAcceleration());
        this.setBlood(car.getBlood());
        this.setTopSpeed(car.getTopSpeed());
    }
    public CarVO(){}

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
}

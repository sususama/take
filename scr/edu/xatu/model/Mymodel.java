package edu.xatu.model;

public class Mymodel extends RoadThing {//车的模型
    private int x;
    private int y;
    private int width;
    private int height;
    private CarNetGame carNetGame=null;//把车的初始数据传进来
    private Car car;

    public Mymodel(int id, int distance, int left, int width, int height,Road road) {
        super(id, distance, left, width, height, road);
//        setX(super.getLeft());
//        setY(super.getDistance());
    }

//    public Mymodel(Car car){
//        super();
//        setX(car.getLeft());
//        setY(car.getDistance());
//    }

    //    public Mymodel() {
//        x=0;
//        y=0;
//        width=115;
//        height=150;
//    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public CarNetGame getCarNetGame() {
        return carNetGame;
    }
    public void setCarNetGame(CarNetGame carNetGame) {
        this.carNetGame = carNetGame;
    }

    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        this.car = car;
    }


    public void left() {
        this.x-=10;
    }
    public void right() {
        this.x+=10;
    }
    public void down() {
        this.y+=10;
    }
    public void up() {
        this.y-=10;
    }
}

package edu.xatu.model;

import edu.xatu.view.MyCavas;

public abstract class RoadThing {
    private int id;
    private int distance;//起点
    private int left;//距离左边长度
    private int width;
    private int height;
    private Road road;
    private Mymodel mymodel=null;


    public RoadThing(int id, int distance, int left, int width, int height, Road road) {
        this.id = id;
        this.distance = distance;
        this.left = left;
        this.width = width;
        this.height = height;
        this.road=road;
//        mymodel.setX(this.left);
//        mymodel.setY(this.height);
    }

    public Road getRoad() {
        return road;
    }
    public void setRoad(Road road) {
        this.road = road;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getDistance() {
        return distance;
    }
    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getLeft() {
        return left;
    }
    public void setLeft(int left) {
        this.left = left;
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

    public Mymodel getMymodel() {
        return mymodel;
    }
    public void setMymodel(Mymodel mymodel) {
        this.mymodel = mymodel;
    }

    public void down(int speed) {
        if (this.distance>300) {
            this.getRoad().setAc(this.getRoad().getAc()-speed);
        }
            setDistance(getDistance() - speed);
    }

    public void up(int speed) {
        if (this.distance>300) {
            this.getRoad().setAc(this.getRoad().getAc()+speed);
        }
        setDistance(getDistance() + speed);

    }

    public void right(int speed) {
        if (this.left< MyCavas.GAME_HEIGHT-60)
        setLeft(getLeft()+speed);
    }

    public void left(int speed) {
        if (this.left>0)
        setLeft(getLeft()-speed);
    }
}


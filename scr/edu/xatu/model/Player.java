package edu.xatu.model;

import edu.xatu.view.MyCavas;
import edu.xatu.vo.PlayerVO;

import java.awt.*;

public class Player {
    private String name;
    private  int ex;
    private CarNetGame game;
    private Car car;
    private int index=-1;
    private Mymodel mymodel=null;

    public Player(String palyerName, CarNetGame game) {
        this.name=palyerName;
        this.game=game;
        this.car=new Car(this);
    }

    public Player(PlayerVO playerVO, CarNetGameCilent game) {
        this.name=playerVO.getName();
        this.game=game;
        this.car=new Car(playerVO.getCarVO(),this);
    }

    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        this.car = car;
    }

    public CarNetGame getGame() {
        return game;
    }
    public void setGame(CarNetGame game) {
        this.game = game;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getEx() {
        return ex;
    }
    public void setEx(int ex) {
        this.ex = ex;
    }


    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }

    public Mymodel getMymodel() {
        return mymodel;
    }
    public void setMymodel(Mymodel mymodel) {
        this.mymodel = mymodel;
    }

    public void draw(Graphics g) {
        g.drawString(this.getName(),getCar().getLeft(), this.car.getDistance() - 50);
//        g.drawString(getName(),20,625);
        car.draw(g);
    }

    public void left() {
        this.car.left();
    }

    public void right() {
        this.car.right();
    }

    public void down() {
        this.car.down();
    }

    public void up() {
        this.car.up();
    }
}

package edu.xatu.model;

import edu.xatu.util.GameUtil;
import edu.xatu.view.MyCavas;
import edu.xatu.vo.CarVO;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Car extends RoadThing {
    private int speed;//速度
    private int blood;
    private int acceleration;//车的位置
    private BufferedImage carImage = null;
    private int topSpeed;//最高速度
    private Player player;
    private Bullet bullet;//发射

    public Car(Player player) {
        super(player.getIndex(),0,0,51,115,player.getGame().getRoad());
        super.setRoad(player.getGame().getRoad());
        try {
            init();
            this.player=player;
            this.acceleration=1;//加速度
            this.blood=100;
            this.topSpeed=20;
            this.speed=10;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void init() throws IOException {
        carImage = ImageIO.read(Thread
                .currentThread()
                .getContextClassLoader()
                .getResourceAsStream("edu/xatu/zhaopian/汽车.png"));
    }
    public Car(CarVO carVO, Player player) {
        super(carVO.getId(),carVO.getDistance(),carVO.getLeft(),
                carVO.getWidth(),carVO.getHeight(),
                player.getGame().getRoad());
        try {
            init();
            this.speed=carVO.getSpeed();
            this.setAcceleration(carVO.getAcceleration());
            this.setPlayer(player);
            this.setBlood(carVO.getBlood());
            this.setTopSpeed(carVO.getTopSpeed());
            this.setPlayer(player);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public Bullet getBullet() {
        return bullet;
    }
    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }

    public Player getPlayer() {
        return player;
    }
    public void setPlayer(Player player) {
        this.player = player;
    }

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

    public void left() {
        if (this.speed<=this.topSpeed){
            this.speed*=this.acceleration;
        }
        super.left(this.getSpeed());
    }

    public void right() {
        if (this.speed<=this.topSpeed){
            this.speed*=this.acceleration;
        }
        super.right(this.getSpeed());
    }

    public void up() {
        if (this.speed<=this.topSpeed){
            this.speed*=this.acceleration;
        }
        super.up(this.getSpeed());
    }

    public void down() {
        if (this.speed<=this.topSpeed){
            this.speed*=this.acceleration;
        }
        super.down(this.getSpeed());
    }

    public void draw(Graphics g){
        int ac=0;
        if (this.getRoad()!=null){
            ac=this.getRoad().getAc();
        }
        g.drawImage(carImage, Road.ROAD_LEFT + getLeft(), MyCavas.GAME_HEIGHT-(getDistance()-ac)-getHeight(),null);
    }
}
package edu.xatu.model;

import edu.xatu.view.MyCavas;

import java.awt.*;

public abstract class CarNetGame {//游戏主体
    private MyCavas cavas=null;
    private String status;//游戏状态
    private Player[] players = new Player[5];//玩家
    private Road road;//道路
    private Player major;


    public int addPlayer(Player p) {
        for (int i = 0; i < players.length; i++) {
            if (players[i] == null) {
                p.setIndex(i);
                players[i] = p;
                return i;
            }
        }
        if (p.getIndex() == -1) {
            throw new RuntimeException("玩家数量已满");
        }
        return -1;
    }

    public void addLength(Road r) {
        this.road = r;
    }


    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public Road getRoad() {
        return road;
    }

    public void setRoad(Road road) {
        this.road = road;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Player getMajor() {
        return major;
    }
    public void setMajor(Player major) {
        this.major = major;
    }

    public void draw(Graphics g) {
        //画跑道
        road.draw(g);
        //画玩家
        for (int i = 0; i < players.length; i++) {
            Player player = players[i];
            if (player != null) {
//                    g.drawString(player.getName(),player.getCar().getLeft(),player.getCar().getDistance());
                player.draw(g);
            }
        }
    }
    public void left() {
        this.major.left();
    }
    public void right() {
        this.major.right();
    }
    public void down() {
        this.major.down();
    }
    public void up() {
        this.major.up();
    }
    public MyCavas getCavas() {
        return cavas;
    }
    public void setCavas(MyCavas cavas) {
        this.cavas = cavas;
    }
}

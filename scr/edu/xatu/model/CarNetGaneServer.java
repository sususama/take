package edu.xatu.model;
import edu.xatu.net.CarNetGameSkel;
import edu.xatu.net.ServerMonitor;
import edu.xatu.vo.CarNetGameVo;

import java.net.InetAddress;

public class CarNetGaneServer extends CarNetGame {//服务器
    private CarNetGameSkel skel=null;

    public CarNetGaneServer(String palyerName, int length) {
        skel=new CarNetGameSkel();
        this.addLength(new Road(length,this));
        this.setMajor(new Player(palyerName,this));
        this.addPlayer(getMajor());
//       this.setRoad(new Road(length,this));
        new ServerMonitor(this).start();
    }
    public void join(String playname, int port, String address){
        Player newPlary =new Player(playname,this);
        int majorIndex=this.addPlayer(newPlary);
        this.getCavas().repaint();
        //把服务器端整个模型发给新加入的客户

        CarNetGameVo vo=new CarNetGameVo(this);
        vo.setMajorIndex(majorIndex);
        //给其他玩家发送新加入玩家的数据模型
        skel.join(vo,port,address);
    }

}

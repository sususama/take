package edu.xatu.net;

import edu.xatu.vo.GamePackage;
import edu.xatu.util.JSONUtil;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class CarNetGameStub {
    private DatagramSocket ds=null;
    private int port=8888;
    public CarNetGameStub(){
        while (true){
            try {
                ds=new DatagramSocket(port);
                break;
            } catch (SocketException e) {
                port++;
            }
        }
    }
    /*
    * 第一次加入游戏是调用的方法
    * */
    public void join(String palyerName, String ip) throws Exception {
        //准备vo对象
        GamePackage gp =new GamePackage();
        gp.setType("join");
        gp.setName(palyerName);
        //转为json
        String jsString= JSONUtil.toJson(gp);
        //发送
        DatagramPacket packet=new DatagramPacket(jsString.getBytes(),jsString.getBytes().length, InetAddress.getByName(ip),9999);
        ds.send(packet);
    }

    public DatagramSocket getDs() {
        return ds;
    }

    public void setDs(DatagramSocket ds) {
        this.ds = ds;
    }
}

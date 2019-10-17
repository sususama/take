package edu.xatu.net;

import edu.xatu.model.CarNetGameCilent;
import edu.xatu.util.JSONUtil;
import edu.xatu.vo.GamePackage;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ClientMonitor extends Thread {
    private DatagramSocket ds=null;
    private CarNetGameCilent carNetGameCilent;
    public ClientMonitor(DatagramSocket ds,CarNetGameCilent carNetGameCilent){
        this.ds=ds;
        this.carNetGameCilent=carNetGameCilent;
    }
    public void run(){
        while (true){
            try {
                DatagramPacket packet=new DatagramPacket(new byte[1024],1024);//缓存包
                ds.receive(packet);//接收数据
                String jsStr=new String(packet.getData(),0,packet.getLength());
                GamePackage pg=(GamePackage) JSONUtil.toJava(jsStr);
                switch (pg.getType()){
                    case "create" :
                        carNetGameCilent.create(pg.getCarNetGameVo());
                        carNetGameCilent.setMajor(carNetGameCilent.getPlayers()[pg.getCarNetGameVo().getMajorIndex()]);
                        break;
                    case "":

                        break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

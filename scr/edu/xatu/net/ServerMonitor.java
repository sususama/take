package edu.xatu.net;

import edu.xatu.model.CarNetGaneServer;
import edu.xatu.vo.GamePackage;
import edu.xatu.util.JSONUtil;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ServerMonitor extends Thread {
    private  CarNetGaneServer game;
    private DatagramSocket ds;
    public ServerMonitor(CarNetGaneServer carNetGaneServer){
        try {
            this.game=carNetGaneServer;
            ds=new DatagramSocket(9999);
        } catch (SocketException e) {
            e.printStackTrace();
        }

    }
    public void run(){
        while (true){
            try {
                DatagramPacket packet=new DatagramPacket(new byte[1024],1024);//缓存包
                ds.receive(packet);//接收数据
                String jsStr=new String(packet.getData(),0,packet.getLength());
                GamePackage pkg=(GamePackage) JSONUtil.toJava(jsStr);
                switch (pkg.getType()){
                    case "join" :
                        String playName=pkg.getName();
                       game.join(playName,packet.getPort(),packet.getAddress().getHostName());
                       break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

package edu.xatu.net;

import edu.xatu.util.JSONUtil;
import edu.xatu.vo.CarNetGameVo;
import edu.xatu.vo.GamePackage;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class CarNetGameSkel {
    private DatagramSocket ds =null;
    public  CarNetGameSkel(){
        try {
            ds=new DatagramSocket();
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    public void join(CarNetGameVo vo, int port, String address) {
        try {
            GamePackage gp=new GamePackage();
            gp.setCarNetGameVo(vo);
            gp.setType("create");
            String jsonstr  = JSONUtil.toJson(gp);
            //创建邮包
            DatagramPacket packet=new DatagramPacket(
                    jsonstr.getBytes(),
                    jsonstr.getBytes().length,
                    InetAddress.getByName(address),
                    port
            );
            ds.send(packet);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

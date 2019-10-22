package edu.xatu.model;

import edu.xatu.net.CarNetGameStub;
import edu.xatu.net.ClientMonitor;
import edu.xatu.view.MyCavas;
import edu.xatu.vo.CarNetGameVo;
import edu.xatu.vo.PlayerVO;

public class CarNetGameCilent extends CarNetGame {
    //客户端模型持有客户端通讯代理的引用
    private CarNetGameStub stub=new CarNetGameStub();
    public CarNetGameCilent(String palyerName, String ip) throws Exception {
        new ClientMonitor(stub.getDs(),this).start();
        stub.join(palyerName,ip);
    }//客户端
    public void  create(CarNetGameVo carNetGameVo){
        this.setStatus(carNetGameVo.getStatus());
        this.setRoad(new Road(carNetGameVo.getRoadVO(),this));
        PlayerVO[] playerVOS =carNetGameVo.getPlayerVOS();
        for (int i=0;i<playerVOS.length;i++){
            if (playerVOS[i]!=null){
                this.getPlayers()[i]=new Player(playerVOS[i],this);
            }
        }
        MyCavas cavas=this.getCavas();
        cavas.repaint();
    }

}

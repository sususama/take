package edu.xatu.vo;

import edu.xatu.model.CarNetGaneServer;
import edu.xatu.model.Player;

public class CarNetGameVo {
    private RoadVO roadVO;
    private PlayerVO[] playerVOS =new PlayerVO[5];
    private String status;
    private int majorIndex;

    public CarNetGameVo(){

    }
    public CarNetGameVo(CarNetGaneServer carNetGaneServer) {
        this.setStatus(carNetGaneServer.getStatus());
        this.setRoadVO(new RoadVO(carNetGaneServer.getRoad()));
        Player[] players=carNetGaneServer.getPlayers();
        for (int i=0;i<players.length;i++){
            if (players!=null){
                playerVOS[i] =new PlayerVO(players[i]);
            }
        }
    }

    public RoadVO getRoadVO() {
        return roadVO;
    }

    public void setRoadVO(RoadVO roadVO) {
        this.roadVO = roadVO;
    }

    public PlayerVO[] getPlayerVOS() {
        return playerVOS;
    }

    public void setPlayerVOS(PlayerVO[] playerVOS) {
        this.playerVOS = playerVOS;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getMajorIndex() {
        return majorIndex;
    }

    public void setMajorIndex(int major) {
        this.majorIndex = major;
    }
}

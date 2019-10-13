package edu.xatu.vo;

import edu.xatu.model.Player;

public class PlayerVO {
    private String name;
    private CarVO carVO;

    public PlayerVO(Player player) {
        this.name=player.getName();
        this.carVO=new CarVO(player.getCar());
    }
    public PlayerVO(){}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CarVO getCarVO() {
        return carVO;
    }

    public void setCarVO(CarVO carVO) {
        this.carVO = carVO;
    }
}

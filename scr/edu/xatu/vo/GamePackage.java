package edu.xatu.vo;


import edu.xatu.vo.CarNetGameVo;

public class GamePackage {
    private String type;//加入，创建，移动
    private int port;//客户端的端口
    private String name;//传递用户名
    private CarNetGameVo carNetGameVo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CarNetGameVo getCarNetGameVo() {
        return carNetGameVo;
    }

    public void setCarNetGameVo(CarNetGameVo carNetGameVo) {
        this.carNetGameVo = carNetGameVo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}

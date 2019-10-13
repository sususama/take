package edu.xatu.vo;


import edu.xatu.model.Road;

import java.util.ArrayList;

public class RoadVO {
    private int length;
    private ArrayList<RoadThingVO> roadThingVOList=new ArrayList<RoadThingVO>();

    public RoadVO(Road road) {
        this.length=road.getRoadlength();

    }

    public RoadVO(){}
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public ArrayList<RoadThingVO> getRoadThingVOList() {
        return roadThingVOList;
    }

    public void setRoadThingVOList(ArrayList<RoadThingVO> roadThingVOList) {
        this.roadThingVOList = roadThingVOList;
    }
}

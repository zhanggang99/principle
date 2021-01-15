package com.desing.structural.facade;

//资格查询
public class QualifyService {
    public boolean isAvlibial(PointsGift pointsGift){
        System.out.println("礼物名称："+pointsGift.getName()+" 积分通过，库存通过");
        return true;
    }
}

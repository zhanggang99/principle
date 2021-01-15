package com.desing.structural.facade;

public class Shippingservice {
    public String shipGift(PointsGift pointsGift){
        //物流逻辑
        System.out.println("进入物流系统："+pointsGift.getName());
        String shipCodeId="666";
        return shipCodeId;
    }
}

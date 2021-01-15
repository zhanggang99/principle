package com.desing.structural.facade;

//积分支付服务
public class PointPaymentService {
    public boolean pay(PointsGift pointsGift){
        //扣减积分
        System.out.println("积分支付礼物 "+pointsGift.getName()+" 成功");
        return true;
    }
}

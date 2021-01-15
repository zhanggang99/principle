package com.desing.structural.facade;

public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift=new PointsGift("手机");
        GiftExchangeService giftExchangeService=new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);
    }
}

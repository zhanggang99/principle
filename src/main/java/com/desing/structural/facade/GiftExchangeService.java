package com.desing.structural.facade;

//礼物兑换服务，对外公开
public class GiftExchangeService {
    private PointPaymentService pointPaymentService=new PointPaymentService();
    private QualifyService qualifyService=new QualifyService();
    private Shippingservice shippingservice=new Shippingservice();

//    public void setPointPaymentService(PointPaymentService pointPaymentService) {
//        this.pointPaymentService = pointPaymentService;
//    }
//
//    public void setQualifyService(QualifyService qualifyService) {
//        this.qualifyService = qualifyService;
//    }
//
//    public void setShippingservice(Shippingservice shippingservice) {
//        this.shippingservice = shippingservice;
//    }
    public void giftExchange(PointsGift pointsGift){
        if (qualifyService.isAvlibial(pointsGift)){
            //积分足够
            if (pointPaymentService.pay(pointsGift)){
                //扣减成功
                String codeId=shippingservice.shipGift(pointsGift);
                System.out.println("物流系统下单成功，订单号："+codeId);
            }
        }
    }
}

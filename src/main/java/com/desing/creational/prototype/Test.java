package com.desing.creational.prototype;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail=new Mail();
        mail.setContent("我想要存储这个信息");
        for (int i=0;i<10;i++){
            Mail mailtemp = (Mail) mail.clone();
            mailtemp.setName("姓名"+i);
            mailtemp.setMailAddress("姓名"+i+"@mail.com");
            mailtemp.setContent("中奖了");
            MailUtil.sendMail(mailtemp);
        }
        MailUtil.saveOriginMail(mail);
    }
}

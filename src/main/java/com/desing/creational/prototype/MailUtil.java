package com.desing.creational.prototype;

import java.text.MessageFormat;

public class MailUtil {
    public static void sendMail(Mail mail){
        String outputContent="向{0}同学，地址：{1} 发送邮件，内容：{2}";
        System.out.println(MessageFormat.format(outputContent,mail.getName(),mail.getMailAddress(),mail.getContent()));

    }
    public static void saveOriginMail(Mail mail){
        System.out.println("存储原始邮件："+mail.getContent());
    }
}

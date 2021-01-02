package com.desing.creational.simplefactory;

public class VideoFactory {
    //public Video getVideo(String type){
//        if("java".equalsIgnoreCase(type))
//            return new JavaVideo();
//        else if("pyth".equalsIgnoreCase(type))
//            return new PythonVideo();
//        return null;

        //v3反射。这样如果新增前端客户，只要在test端传前端的类名，不再用修改此工作类。
        public Video getVideo(Class  c){
        Video video=null;
        try {
            video=(Video) Class.forName(c.getName()).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
        }
}

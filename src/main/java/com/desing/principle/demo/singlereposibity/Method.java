package com.desing.principle.demo.singlereposibity;

public class Method {
    private void updateUserInfo(String name,String addr){

    }
    private void updateUserInfo(String name,String... properties){

    }
    private void updateUserInfo(String name,String addr,boolean bool){
        if (bool){

        }else {

        }
    }

    //以上两种，职责信息不明确，会有多种引起变化的场景，改进：
    private void updateUserName(String name){

    }
    private void updateUserAddr(String addr){

    }
    //类如果考虑太多单一责任，会导致类过多，所以我们一般要保证接口和方法要做到单一职责。
}

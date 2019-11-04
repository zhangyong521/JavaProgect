package com.zhangyong.shejimoshi.guanchazhe;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 张勇
 * @Date 2019/11/1 21:25
 * @Version 1.0
 *
 * 第三步：定义被观者
 */
public class BusinessServer implements Obsercerable {
    private List<Observer> list; //面向接口編程

    private String msg;

    public BusinessServer(){
        list = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (!list.isEmpty()){
            list.remove(observer);
        }
    }

    /**
     * 遍历
     */
    @Override
    public void notifyObserver() {
        for (int i = 0; i < list.size(); i++) {
            Observer observer = list.get(i);
            observer.update(msg); //通知Observer调用update方法
        }
    }
    public void setMsg(String msg){
        this.msg=msg;
        System.out.println("业务数据发生更新："+msg);
        /**
         * 当被观察者调用notifyObserver()方法时，观察者的update（）的方法builder被调回
         */
        notifyObserver();//消息更新，通知所有的观察者
    }
}

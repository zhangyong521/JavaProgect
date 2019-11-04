package com.zhangyong.shejimoshi.guanchazhe;

/**
 * @Author 张勇
 * @Date 2019/11/1 21:21
 * @Version 1.0
 *
 * 第二步：定义抽象被观者接口
 */
public interface Obsercerable {
    /**
     * 条件观察者
     * @param o
     */
    void registerObserver(Observer o);
    /**
     * 删除观察者
     * @param o
     */
    void removeObserver(Observer o);

    /**
     * 通知观察者
     * @param o
     */
    void notifyObserver();
}

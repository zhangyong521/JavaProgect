package com.zhangyong.shejimoshi.gongchang.gaijin;



/**
 * @Author 张勇
 * @Date 2019/10/18 21:47
 * @Version 1.0
 */
public class TrafficFactory {
    public static Traffic create(String type){//类名
        Traffic res=null;
        String className="com.hc.product."+type;//建设所有的产品类全部放在com.hc.product中
        try {
            res = (Traffic) Class.forName(className).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return res;
    }
}

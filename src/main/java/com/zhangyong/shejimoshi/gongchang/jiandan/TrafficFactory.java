package com.zhangyong.shejimoshi.gongchang.jiandan;

/**
 * @Author 张勇
 * @Date 2019/10/18 21:47
 * @Version 1.0
 */
public class TrafficFactory {
    public static Traffic create(String type){ //type指的是用记要生产的车型的名称
        type = type.toLowerCase(); //大小写转换

        switch (type){
            case "audi":
                return new Audi();
            case "benz":
                return new Benz();
            case "bwm":
                return new BWM();
                default:
                    return null;
        }

    }
}

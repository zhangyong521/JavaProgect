package com.zhangyong.json.fastjson.zhujie;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * @Author 张勇
 * @Date 2019/10/19 15:51
 * @Version 1.0
 */
public class Stu {
    @JSONField(ordinal = 0) //指定序列化顺序
    private int id;
    @JSONField(ordinal = 0,name="StuName") //指定序列化的字段名
    private String name;
    @JSONField(ordinal = 2,format = "yyyy-mm-dd") //指定序列化的日期格式
    private Date birth;
    @JSONField(ordinal = 3,serialize = false,deserialize = false)//指定字段不序列化，不反序列化
    private float score;

    public Stu() {
    }

    public Stu(int id, String name, Date birth, float score) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birth=" + birth +
                ", score=" + score +
                '}';
    }
}

package com.zhangyong.json.map;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * @Author 张勇
 * @Date 2019/10/19 13:16
 * @Version 1.0
 */
public class Dept1 {
    @Expose //参与序列化与反序列化
    @SerializedName("no") //指定序列化反序列化的名称
    private Integer deptno;
    @Expose(serialize = false,deserialize = false) //不参与序列化与反序列化
    private String dname;
    @Expose(serialize = false )//只序列化
    private String loc;

    public Dept1() {
    }

    public Dept1(Integer deptno, String dname, String loc) {
        this.deptno = deptno;
        this.dname = dname;
        this.loc = loc;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }
}

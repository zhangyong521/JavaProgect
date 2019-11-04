package com.zhangyong.json.jackson.zhujie;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

import java.util.Date;

/**
 * @Author 张勇
 * @Date 2019/10/19 16:35
 * @Version 1.0
 */
public class Stu {
    @JsonProperty("num")
    private int id;
    private String name;
    @JsonFormat(pattern = "YYYY-MM-dd")
    private Date birth;
    @JsonIgnore
    private float score;
    @JsonUnwrapped(prefix ="addr_")
    private Addr addr;

    public Stu() {
    }

    public Stu(int id, String name, Date birth, float score, Addr addr) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.score = score;
        this.addr = addr;
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

    public Addr getAddr() {
        return addr;
    }

    public void setAddr(Addr addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birth=" + birth +
                ", score=" + score +
                ", addr=" + addr +
                '}';
    }

    static class Addr{
        private String province;
        private String city;

        public Addr() {
        }

        public Addr(String province, String city) {
            this.province = province;
            this.city = city;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        @Override
        public String toString() {
            return "Addr{" +
                    "province='" + province + '\'' +
                    ", city='" + city + '\'' +
                    '}';
        }
    }
}

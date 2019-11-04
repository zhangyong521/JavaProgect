package com.zhangyong.jsonlib;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @Author 张勇
 * @Date 2019/10/19 17:27
 * @Version 1.0
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class TianQi {

    private String message;
    private int status;
    private String date;
    private String time;
    private CityInfoBean cityInfo;
    private DataBean data;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    public static class CityInfoBean {


        private String city;
        private String citykey;
        private String parent;
        private String updateTime;

    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    public static class DataBean {

        private String shidu;
        private int pm25;
        private int pm10;
        private String quality;
        private String wendu;
        private String ganmao;
        private YesterdayBean yesterday;
        private List<ForecastBean> forecast;

        @Getter
        @Setter
        @AllArgsConstructor
        @NoArgsConstructor
        @ToString

        public static class YesterdayBean {

            private String date;
            private String high;
            private String low;
            private String ymd;
            private String week;
            private String sunrise;
            private String sunset;
            private int aqi;
            private String fx;
            private String fl;
            private String type;
            private String notice;


        }

        @Getter
        @Setter
        @AllArgsConstructor
        @NoArgsConstructor
        @ToString
        public static class ForecastBean {

            private String date;
            private String high;
            private String low;
            private String ymd;
            private String week;
            private String sunrise;
            private String sunset;
            private int aqi;
            private String fx;
            private String fl;
            private String type;
            private String notice;

        }
    }
}

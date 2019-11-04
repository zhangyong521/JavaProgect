package com.zhangyong.shejimoshi.zerenlian.china;

import org.omg.CORBA.Request;

import javax.xml.ws.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author 张勇
 * @Date 2019/11/1 8:20
 * @Version 1.0
 */
public class FilterChain implements MsgFilter {
    List<MsgFilter> filters = new ArrayList<>();
    public FilterChain addFilter(MsgFilter filter){
        filters.add(filter);
        return this;
    }
    @Override
    public String doFilter(String msg) {
        for (MsgFilter filter : filters){
            msg=filter.doFilter(msg);
        }
        return msg;
    }
}

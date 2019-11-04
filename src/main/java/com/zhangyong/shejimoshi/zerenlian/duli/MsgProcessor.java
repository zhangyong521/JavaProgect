package com.zhangyong.shejimoshi.zerenlian.duli;

/**
 * @Author 张勇
 * @Date 2019/10/31 20:19
 * @Version 1.0
 */
public class MsgProcessor {
    private String msg;
    public void setMsg(String msg){
        this.msg=msg;
    }
    public MsgFilter[] filters = {new HtmlFilter(),new EmojiFilter(),new SensitiveFilter()};
    public String process(){
      for (MsgFilter filter : filters){
          msg=filter.doFilter(msg);
      }
        return msg;
    }
}

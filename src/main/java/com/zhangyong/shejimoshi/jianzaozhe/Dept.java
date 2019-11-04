package com.zhangyong.shejimoshi.jianzaozhe;

/**
 * @Author 张勇
 * @Date 2019/10/18 21:10
 * @Version 1.0
 */
public class Dept {
    private Integer deptno;
    private String dname;
    private String loc;

    //步骤5：实体类的全参构造方法
    public Dept(Integer deptno, String dname, String loc) {
        this.deptno = deptno;
        this.dname = dname;
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

    //步骤2：提供返回Builder的静态方法
    public static DeptBuilder newBuilder() {
        return new DeptBuilder();
    }

    //步骤1：定义Builder类
    public static class DeptBuilder {
        //步骤3：提供和实体类一样的属性
        private Integer deptno;
        private String dname;
        private String loc;

        //步骤4：提供设置属性的方法
        public DeptBuilder deptno(Integer deptno) {
            this.deptno = deptno;
            return this;
        }

        public DeptBuilder dname(String dname) {
            this.dname = dname;
            return this;
        }

        public DeptBuilder loc(String loc) {
            this.loc = loc;
            return this;
        }

        //步骤6：提供返回实体类的方法
        public Dept build() {
            return new Dept(deptno, dname, loc);
        }
    }
}

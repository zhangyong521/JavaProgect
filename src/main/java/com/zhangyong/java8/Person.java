package com.zhangyong.java8;

import java.util.Comparator;

/**
 * @Author 张勇
 * @Date 2019/10/18 10:24
 * @Version 1.0
 */
public class Person {
    int age;
    String firstName;
    String lastName;

    public Person() {
    }

    public Person(int age, String firstName, String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
    //把Comparator抽取出来，变成是Person对象的成员变量，然后引用这个变量：

    public static Comparator<Person> firstNameFun=(p1,p2)->{
        return p1.firstName.compareTo(p2.firstName);
    };

    public static Comparator<Person> lastNameFun=(p1,p2)->{
        return p1.lastName.compareTo(p2.lastName);
    };

    //创建一个满足Comparator签名的方法，然后直接调用

    public static int firstNameFun(Person o1,Person o2){
        return o1.firstName.compareTo(o2.firstName);
    }
    public static int lastNameFun(Person o1,Person o2){
        return o1.lastName.compareTo(o2.lastName);
    }

}

package com.zhangyong.java8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Author 张勇
 * @Date 2019/10/18 10:26
 * @Version 1.0
 *  Java8方法引用
 */
public class Test {
    public static void main(String[] args) {
        Person[] persons = {new Person(22, "zhang", "san"), new Person(33, "li", "si"), new Person(44, "wang", "wu"),new Person(44, "wang", "er")};

        //测试
        /*Arrays.sort(persons,(p1,p2)->p1.firstName.compareTo(p2.firstName));
        for (int i=0;i<persons.length;i++){
            System.out.println(persons[i]);
        }*/
        //改进测试一：
        /*Arrays.sort(persons,Person.firstNameFun);
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }*/
        //改进测试二：
       /* for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }*/

        //改进测试三：
       /* Arrays.sort(persons,Comparator.comparing(person->person.getFirstName()));
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }
        Arrays.sort(persons,Comparator.comparing(Person::getLastName));
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);*/

        //先按照lastName，然后按照age排序

        /*Arrays.sort(persons, (p1, p2) -> {
            if (p1.lastName.equals(p2.lastName)) {
                return p1.age - p2.age;
            } else {
                return p1.lastName.compareTo(p2.lastName);
            }
        });
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }*/
        //改进一测试
        /*Collections.sort(Arrays.asList(persons),
                Comparator.comparing(Person::getFirstName)
                .thenComparing(Person::getLastName)
                .thenComparing(Person::getAge));
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }*/
        //改进二测试

        Collections.sort(Arrays.asList(persons),
        Comparator.comparingInt(person->((Person)person).getFirstName().length())
        .thenComparing(person->((Person)person).getLastName())
        .thenComparing(person->((Person)person).getAge()));
        Comparator.comparing(Person::getFirstName);
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }

    }

}


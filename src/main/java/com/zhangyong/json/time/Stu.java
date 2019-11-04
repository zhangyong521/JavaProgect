package com.zhangyong.json.time;

import javax.naming.Name;
import java.util.Date;

/**
 * @Author 张勇
 * @Date 2019/10/19 15:18
 * @Version 1.0
 */
public class Stu {
    private int id;
    private Name name;
    private Date birth;

    public Stu() {
    }

    public Stu(int id, Name name, Date birth) {
        this.id = id;
        this.name = name;
        this.birth = birth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "id=" + id +
                ", name=" + name +
                ", birth=" + birth +
                '}';
    }
    public static class Name{
        private String firstName;
        private String lastName;

        public Name() {
        }

        public Name(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
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
            return "Name{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }
    }
}

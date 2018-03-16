/**
 * FileName: Student
 * Author: 汪栋才
 * Date: 2018/3/16 15:19
 * Description: 学生实体类
 */
package com.wdc.bean;

import java.io.Serializable;

/**
 * <一句话功能简述><br>
 *<学生实体类>
 * @author 汪栋才
 * @greate 2018/3/16
 * */
public class Student implements Serializable{
    private Integer id;
    private String name;
    private Integer age;
    private String phone;

    public Student(Integer id, String name, Integer age, String phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public Student() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}

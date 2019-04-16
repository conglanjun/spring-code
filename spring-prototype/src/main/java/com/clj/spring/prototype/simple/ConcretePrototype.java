package com.clj.spring.prototype.simple;

import java.util.ArrayList;

/**
 * User: conglanjun
 * Date: 2019/4/16
 * Time: 9:25
 * Description:
 */
public class ConcretePrototype implements Cloneable{

    private int age;

    private String name;

    public ArrayList<String> list = new ArrayList<String>();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        ConcretePrototype prototype = null;
        try{
            prototype = (ConcretePrototype) super.clone();
            prototype.list = (ArrayList<String>) list.clone();

            // 克隆基于字节码的
            // 用反射，或者循环。
        }catch (Exception e){

        }
        return prototype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

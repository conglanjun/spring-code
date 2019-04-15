package com.clj.spring.factory.abstr;

/**
 * User: conglanjun
 * Date: 2019/4/14
 * Time: 23:28
 * Description:
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        DefaultFactory factory = new DefaultFactory();
        System.out.println(factory.getCar("Benz"));
    }

}

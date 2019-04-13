package com.clj.spring.factory.simple;

import com.clj.spring.factory.Car;

/**
 * User: conglanjun
 * Date: 2019/4/13
 * Time: 23:16
 * Description:
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        // 这边就是我们的消费者
        Car car = new SimpleFactory().getCar("BMW");
        System.out.println(car.getName());
    }

}

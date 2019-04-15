package com.clj.spring.factory.abstr;

import com.clj.spring.factory.Benz;
import com.clj.spring.factory.Car;
import com.clj.spring.factory.func.Factory;

/**
 * User: conglanjun
 * Date: 2019/4/14
 * Time: 22:41
 * Description:
 */
public class BenzFactory extends AbstractFactory{
    public Car getCar() {
        return new Benz();
    }
}

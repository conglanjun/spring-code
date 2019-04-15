package com.clj.spring.factory.abstr;

import com.clj.spring.factory.Car;

/**
 * User: conglanjun
 * Date: 2019/4/14
 * Time: 23:28
 * Description:
 */
public class DefaultFactory extends AbstractFactory{

    private AudiFactory defaultFactory = new AudiFactory();

    protected Car getCar() {
        return defaultFactory.getCar();
    }
}

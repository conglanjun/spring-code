package com.clj.spring.factory.func;

import com.clj.spring.factory.Audi;
import com.clj.spring.factory.Car;

/**
 * User: conglanjun
 * Date: 2019/4/14
 * Time: 22:41
 * Description:
 */
public class AudiFactory implements Factory{
    public Car getCar() {
        return new Audi();
    }
}

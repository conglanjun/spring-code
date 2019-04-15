package com.clj.spring.factory.func;

import com.clj.spring.factory.BMW;
import com.clj.spring.factory.Car;

/**
 * User: conglanjun
 * Date: 2019/4/14
 * Time: 22:41
 * Description:
 */
public class BmwFactory implements Factory{
    public Car getCar() {
        return new BMW();
    }
}

package com.clj.spring.factory.abstr;

import com.clj.spring.factory.Audi;
import com.clj.spring.factory.BMW;
import com.clj.spring.factory.Benz;
import com.clj.spring.factory.Car;

/**
 * User: conglanjun
 * Date: 2019/4/14
 * Time: 23:23
 * Description:
 */
public abstract class AbstractFactory {

    protected abstract Car getCar();

    public Car getCar(String name){
        if("BMW".equalsIgnoreCase(name)){
            return new BmwFactory().getCar();
        }else if("Benz".equalsIgnoreCase(name)){
            return new BenzFactory().getCar();
        }else if("Audi".equalsIgnoreCase(name)){
            return new AudiFactory().getCar();
        }else {
            System.out.println("这个产品产不出来");
            return null;
        }
    }

}

package com.clj.spring.factory.simple;

import com.clj.spring.factory.Audi;
import com.clj.spring.factory.BMW;
import com.clj.spring.factory.Benz;
import com.clj.spring.factory.Car;

/**
 * User: conglanjun
 * Date: 2019/4/13
 * Time: 23:15
 * Description:
 */
public class SimpleFactory {

    public Car getCar(String name){
        if("BMW".equalsIgnoreCase(name)){
            return new BMW();
        }else if("Benz".equalsIgnoreCase(name)){
            return new Benz();
        }else if("Audi".equalsIgnoreCase(name)){
            return new Audi();
        }else {
            System.out.println("这个产品产不出来");
            return null;
        }
    }

}

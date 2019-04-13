package com.clj.spring.custom;

import com.clj.spring.proxy.jdk.Meipo;
import com.clj.spring.proxy.jdk.Person;
import com.clj.spring.proxy.jdk.XiaoXingxing;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * User: conglanjun
 * Date: 2019/4/13
 * Time: 7:17
 * Description:
 */
public class TestFindLove {
    public static void main(String[] args) {
        try{
            Person obj = (Person) new CLJMeipo().getInstance(new XiaoXingxing());
            System.out.println(obj.getClass());
            obj.findLove();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}










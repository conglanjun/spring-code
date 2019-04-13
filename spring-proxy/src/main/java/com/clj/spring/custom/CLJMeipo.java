package com.clj.spring.custom;

import com.clj.spring.proxy.jdk.Person;

import java.lang.reflect.Method;

/**
 * User: conglanjun
 * Date: 2019/4/13
 * Time: 12:08
 * Description:
 */
public class CLJMeipo implements CLJInvocationHandler{

    private Person target;

    // 获取被代理人个人资料
    public Object getInstance(Person target) throws Exception{
        this.target = target;
        Class clazz = target.getClass();
        System.out.println("被代理对象的class是：" + clazz);
        // 自动返回一个代理对象出来了。
        return CLJProxy.newProxyInstance(new CLJClassLoader(), clazz.getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

//        System.out.println("我是媒婆：你的性别是：" + this.target.getSex() + "得给你找个异性才行");
        System.out.println("我是媒婆：你的性别是：" + "得给你找个异性才行");
        System.out.println("开始海选...");
        System.out.println("---------------------------");
        this.target.findLove();
        System.out.println("---------------------------");
        System.out.println("如果合适的话，就准备办事");
        return null;
    }
}

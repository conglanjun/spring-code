package com.clj.spring.proxy.jdk;

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
//        new XiaoXingxing().findLove();
        try{
            Person obj = (Person) new Meipo().getInstance(new XiaoXingxing());
            System.out.println(obj.getClass());
            obj.findLove();

            // 原理：
            // 1.拿到被代理对象的引用，然后获取他的接口。
            // 2.JDK代理重新生成一个类，同时实现我们给的代理对象所实现的接口。
            // 3.被代理对象的引用也拿到了。
            // 4.重新动态生成一个class字节码
            // 5.然后编译

            // 获取字节码
            byte[] data = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
            FileOutputStream os = new FileOutputStream("E:/$Proxy0.class");
            os.write(data);
            os.close();

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}










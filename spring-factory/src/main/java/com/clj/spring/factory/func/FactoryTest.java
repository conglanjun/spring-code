package com.clj.spring.factory.func;

/**
 * User: conglanjun
 * Date: 2019/4/14
 * Time: 22:45
 * Description:
 */
public class FactoryTest {

    public static void main(String[] args) {
        // 工厂方法模式
        // 各个产品的生产商，都拥有各自的工厂
        // 生产工艺，生产的高科技程度是不一样的
        Factory factory = new AudiFactory();
        System.out.println(factory.getCar());

        factory = new BmwFactory();
        System.out.println(factory.getCar());
    }

}

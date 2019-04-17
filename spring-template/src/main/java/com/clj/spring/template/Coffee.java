package com.clj.spring.template;

/**
 * User: conglanjun
 * Date: 2019/4/16
 * Time: 22:35
 * Description:
 */
public class Coffee extends Beverage{

    // 原材料放到杯中
    protected void addCoundiments() {
        System.out.println("将咖啡倒入杯中");
    }

    // 放辅料
    protected void pourInCup() {
        System.out.println("添加牛奶和糖");
    }
}

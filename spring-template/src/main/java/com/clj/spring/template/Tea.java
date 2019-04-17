package com.clj.spring.template;

/**
 * User: conglanjun
 * Date: 2019/4/16
 * Time: 22:39
 * Description:
 */
public class Tea extends Beverage {

    // 放辅料
    protected void addCoundiments() {
        System.out.println("添加蜂蜜");
    }

    // 放原料
    protected void pourInCup() {
        System.out.println("将茶叶放入杯中");
    }
}

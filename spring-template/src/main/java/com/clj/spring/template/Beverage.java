package com.clj.spring.template;

/**
 * User: conglanjun
 * Date: 2019/4/16
 * Time: 22:21
 * Description: 冲饮料（拿出去卖钱），这是个机器
 */
public abstract class Beverage {

    // 不能被重写
    public final void create(){
        // 1.把水烧开
        boilWater();
        // 2.把杯子准备好，把原材料放到杯子中
        pourInCup();
        // 3.用水冲泡
        brew();
        // 4.添加辅料
        addCoundiments();
    }

    protected abstract void addCoundiments();

    public void brew() {
        System.out.println("将开水放入杯中进行冲泡");
    }

    protected abstract void pourInCup();

    public void boilWater() {
        System.out.println("烧开水，烧到100度可以起锅了");
    }

}

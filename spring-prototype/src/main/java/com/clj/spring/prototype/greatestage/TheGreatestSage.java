package com.clj.spring.prototype.greatestage;

import java.util.Date;

/**
 * User: conglanjun
 * Date: 2019/4/16
 * Time: 13:20
 * Description: 齐天大圣
 */
public class TheGreatestSage extends Monkey implements Cloneable {

    // 金箍棒
    private GoldRingedStaff staff;

    // 从石头缝里蹦出来
    public TheGreatestSage(){
        this.staff = new GoldRingedStaff();
        this.birthday = new Date();
        this.height = 150;
        this.weight = 30;
    }

    // 分身技能
    public Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    // 变化
    public void change(){
        TheGreatestSage copySage = (TheGreatestSage) clone();
        System.out.println("大圣本尊生日是:" + this.getBirthday().getTime());
        System.out.println("克隆大圣的生日是:" + this.getBirthday().getTime());
        System.out.println("大圣本尊和克隆的大圣是否为同一个对象:" + (this == copySage));
        System.out.println("大圣本尊持有的金箍棒跟克隆大圣持有的金箍棒是否为同一个对象:" + (this.getStaff() == copySage.getStaff()));
    }

    public GoldRingedStaff getStaff() {
        return staff;
    }

    public void setStaff(GoldRingedStaff staff) {
        this.staff = staff;
    }
}

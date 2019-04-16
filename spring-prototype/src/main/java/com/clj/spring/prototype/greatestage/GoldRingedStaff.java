package com.clj.spring.prototype.greatestage;

/**
 * User: conglanjun
 * Date: 2019/4/16
 * Time: 13:21
 * Description: 金箍棒
 */
public class GoldRingedStaff {
    private float height = 100;// 长度
    private float diameter = 10;// 直径

    /**
     * 金箍棒长大
     */
    public void grow(){
        this.diameter *= 2;
        this.height *= 2;
    }

    /**
     * 金箍棒缩小
     */
    public void shrink(){
        this.diameter /= 2;
        this.height /= 2;
    }
}

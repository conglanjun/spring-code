package com.clj.spring.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * User: conglanjun
 * Date: 2019/4/15
 * Time: 23:10
 * Description:
 */
public class MyListTest {
    public static void main(String[] args) {
        // 策略模式
        List<Long> numbers = new ArrayList<Long>();
        Collections.sort(numbers, new Comparator<Long>() {
            // 返回值是固定的
            // 0、-1、1
            // 0、<0、>0
            // Returns a negative integer, zero, or a positive integer
            // as the first argument is less than, equal to, or greater than the second.
            public int compare(Long o1, Long o2) {
                // 中间的逻辑是不一样的
                return 0;
            }
        });
    }
}

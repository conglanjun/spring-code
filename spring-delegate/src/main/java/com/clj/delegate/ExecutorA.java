package com.clj.delegate;

/**
 * User: conglanjun
 * Date: 2019/4/15
 * Time: 13:38
 * Description:
 */
// 这是种想法，用代码来描述这种想法？
// 所以，写的比较简单
public class ExecutorA implements IExecutor {
    public void doing() {
        System.out.println("员工A开始执行任务");
    }
}

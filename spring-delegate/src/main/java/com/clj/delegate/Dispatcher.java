package com.clj.delegate;

/**
 * User: conglanjun
 * Date: 2019/4/15
 * Time: 13:44
 * Description:
 */
public class Dispatcher implements IExecutor{
    
    IExecutor executor;

    Dispatcher(IExecutor executor){
        this.executor = executor;
    }

    // 项目经理，虽然也有执行方法
    // 但是他的工作职责是不一样的
    public void doing() {
        this.executor.doing();
    }
}

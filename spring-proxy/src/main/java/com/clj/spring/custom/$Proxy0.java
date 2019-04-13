package com.clj.spring.custom;
import java.lang.reflect.Method;
public class $Proxy0 implements com.clj.spring.proxy.jdk.Person{
CLJInvocationHandler h;
public $Proxy0(CLJInvocationHandler h) {
this.h = h;
}
public void findLove() {
try{
Method m = com.clj.spring.proxy.jdk.Person.class.getMethod("findLove", new Class[]{});
this.h.invoke(this, m, null);
}catch(Throwable e){e.printStackTrace();}
}
}
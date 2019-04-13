package com.clj.spring.custom;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * User: conglanjun
 * Date: 2019/4/13
 * Time: 11:59
 * Description:
 */
public class CLJProxy {

    private static String ln = "\r\n";

    public static Object newProxyInstance(CLJClassLoader loader, Class<?>[] interfaces, CLJInvocationHandler h){

        // 1.生成源代码
        String proxySrc = generateSrc(interfaces[0]);

        // 2.将生成的源代码输出到磁盘，保存为.java文件
        try {
            String filePath = CLJProxy.class.getResource("").getPath();
            File f = new File(filePath + "$Proxy0.java");
            FileWriter fw = new FileWriter(f);
            fw.write(proxySrc);
            fw.flush();
            fw.close();


            // 3.编译源代码，并且生成.class文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
            Iterable iterable = manager.getJavaFileObjects(f);

            JavaCompiler.CompilationTask task = compiler.getTask(null, manager, null, null, null, iterable);
            task.call();
            manager.close();

            // 4.将class文件中的内容，动态加载到JVM中来

            // 5.返回被代理后的代理对象
            Class<?> proxyClass = loader.findClass("$Proxy0");
            Constructor<?> c = proxyClass.getConstructor(CLJInvocationHandler.class);
            f.delete();
            return c.newInstance(h);
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    private static String generateSrc(Class<?> interfaces){
        StringBuffer src = new StringBuffer();
        src.append("package com.clj.spring.custom;" + ln);
        src.append("import java.lang.reflect.Method;" + ln);
        src.append("public class $Proxy0 implements " + interfaces.getName() + "{" + ln);
        src.append("CLJInvocationHandler h;" + ln);
        src.append("public $Proxy0(CLJInvocationHandler h) {" + ln);
        src.append("this.h = h;" + ln);
        src.append("}" + ln);

        for(Method m : interfaces.getMethods()){
            src.append("public " + m.getReturnType().getName() + " " + m.getName() + "() {" + ln);
            src.append("try{" + ln);
            src.append("Method m = " + interfaces.getName() + ".class.getMethod(\"" + m.getName() + "\", new Class[]{});" + ln);
            src.append("this.h.invoke(this, m, null);" + ln);
            src.append("}catch(Throwable e){e.printStackTrace();}" + ln);
            src.append("}" + ln);
        }
        src.append("}");
        return src.toString();
    }

}

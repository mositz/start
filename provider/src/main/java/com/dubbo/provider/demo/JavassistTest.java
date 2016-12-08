package com.dubbo.provider.demo;

import javassist.*;
import javassist.bytecode.MethodInfo;
import javassist.expr.ExprEditor;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by zhangxingxing on 2016/12/6.
 */
public class JavassistTest {

    public static void main(String[] args) throws Exception {

        ClassPool pool = ClassPool.getDefault();
        CtClass cc = pool.get("com.dubbo.provider.demo.TestActionImpl");
        Class clazz = cc.toClass();
        System.out.println(Arrays.asList(clazz.getGenericSuperclass()));
        System.out.println(Arrays.asList(clazz.getGenericInterfaces()));
//        cc.setSuperclass(pool.get("test.Point"));
//        cc.setSuperclass(pool.get("test.Point"));
        ;

        cc.writeFile();

         CtClass ctClass = pool.makeClass("Point");

         CtClass cc2 =pool.get("com.dubbo.api.demo.DemoService2");

         ctClass.addInterface(cc2);

         Stream.of(cc2.getDeclaredMethods()).forEach((m) -> {
             try {
                 System.err.println(m.getName());
                 System.err.println(m.getParameterTypes());

//                 m.instrument(new ExprEditor(){
//
//                 });


                 CtMethod ctMethod = new CtMethod(m.getReturnType(),m.getName(),m.getParameterTypes(),ctClass);

                 ctMethod.setBody("{ System.out.println(112321);}");

                 ctClass.addMethod(ctMethod);

//
//                 ctMethod.setBody("{ System.out.println(\"123123\"); }");
//
//                 ctClass.addMethod(ctMethod);

             } catch (Exception e) {
                 e.printStackTrace();
             }
         });

        Class cla = ctClass.toClass();

        Object obj = cla.newInstance();

       Stream.of(cla.getDeclaredMethods()).forEach(m -> System.out.println(m.getName()));

       Stream.of(cla.getDeclaredMethods()).forEach(m -> {
           try {
               m.invoke(obj, new Object[]{});
           } catch (IllegalAccessException e) {
               e.printStackTrace();
           } catch (InvocationTargetException e) {
               e.printStackTrace();
           }
       });


    }
}

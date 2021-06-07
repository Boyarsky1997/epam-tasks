package com.github.boyarsky1997.task.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        Class<ReflectionClass> aClass = ReflectionClass.class;
//        Method method = aClass.getDeclaredMethod("method3",String.class);
//        method.setAccessible(true);
//        String string= (String) method.invoke(new ReflectionClass(), "foo");
//        System.out.println(string);
//        Class<ReflectionClass> aClass = ReflectionClass.class;
//        for (Method declaredMethod : aClass.getDeclaredMethods()) {
//            System.out.println(declaredMethod.invoke(s));
//        }

//        Class<Demo> clazz = Demo.class;
//        Field field = clazz.getDeclaredFields()[1];
//        Class type = field.getType();
//        try {
//            field.setAccessible(true);
//            field.set(new Demo(), type.newInstance());
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        }

        Class<Demo> demoClass = Demo.class;

        Method method = demoClass.getDeclaredMethod("myMethod", String[].class);
        method.setAccessible(true);
        String[] arg ={"1"};
        method.invoke(new Demo(), (Object) arg);
        Method method2 = demoClass.getDeclaredMethod("myMethod", String.class, int[].class);
        method2.setAccessible(true);
        int[] arg1 ={11};
        method2.invoke(new Demo(),"roman",arg1);

    }
}

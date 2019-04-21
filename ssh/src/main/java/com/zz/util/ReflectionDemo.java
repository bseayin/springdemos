package com.zz.util;

import com.zz.vo.SelectResultVo;

import java.lang.reflect.*;
import java.math.BigInteger;

/**
 * JAVA反射机制是在运行状态中，
 * 对于任意一个实体类，
 * 都能够知道这个类的所有属性和方法；
 * 对于任意一个对象，都能够调用它的任意方法和属性；
 * 这种动态获取信息以及动态调用对象方法的功能
 * 称为java语言的反射机制
 */
public class ReflectionDemo {
    /**
     * 只要想使用反射，就必须先拿class
     * Class是Reflection故事起源。
     * 针对任何您想探勘的类，唯有先为它产生一个Class 对象，
     * 接下来才能经由后者唤起为数十多个的Reflection APIs。
     * 这些APIs将在稍后的探险活动中一一亮相。
     */

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //要反射，先class
        //获取class对象有三中方法，getClass，.class,forName()
        Class c1=SelectResultVo.class;
        //获取类的，所有变量
        Field[] fields=c1.getDeclaredFields();
        for(Field field:fields){
            //成员变量的名字
            String f1=field.getName();
            //成员变量的数据类型
            Class t1=field.getType();
            System.out.println("成员变量的名字="+f1);
            System.out.println("成员变量的数据类型="+t1.getName());
        }

        System.out.println("********************************");
        Method[] methods=c1.getMethods();
        for(Method method:methods){
            //方法的名称
            String m1=method.getName();
            System.out.println("方法的名称="+m1);
            Parameter[] parameters=method.getParameters();
            for(Parameter parameter:parameters){
                //输入参数的名称
                String p1=parameter.getName();
                //输入参数的类型
                String t1=parameter.getType().getName();
                System.out.println("输入参数的名称="+p1);
                System.out.println("输入参数的类型="+t1);

            }
        }

        //通过反射创建对象
        Object o1=c1.newInstance();
        //获取指定名字的方法
        Method methodsetType=c1.getDeclaredMethod("setType",String.class);
        Method methodgetType=c1.getDeclaredMethod("getType");
        //运行方法
        //Method是jdk自带的类，并且定义了一个方法
        //invoke表示执行本方法，
        // 第一参数是对象，后面的表示方法的输入参数
        methodsetType.invoke(o1,"99999999999");
        Object o2=methodgetType.invoke(o1);
        System.out.println("getType方法的返回值是："+o2);


        //获取构造方法
//        Class[] params=new Class[1];
//        params[0]=BigInteger.class;
        Constructor<SelectResultVo> constructor = c1.getConstructor(BigInteger.class);
// 创建一个对象
        BigInteger bigInteger=new BigInteger("12");
        Object o3=constructor.newInstance(bigInteger);
        //获取selectaccout的get方法
        Method methodget=c1.getDeclaredMethod("getSelectcount");
        Object o4=methodget.invoke(o3);
        System.out.println("selectcount的值是="+o4);





    }

}

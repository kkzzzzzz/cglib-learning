package com.kkzzzzz.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * Created with IntelliJ IDEA.
 * Project: cglib-leanring
 * Author: Kevin
 * Date: 2017/3/25
 * Time: 下午7:45
 */
public class Main {

    public static void main(String[] args) {

        //创建加强类（其实就是代理类的雏形），这是我根据单词意思理解的
        Enhancer enhancer = new Enhancer();

        //代理类需要继承委托类，（使用的是继承实现代理）
        enhancer.setSuperclass(HelloWorld.class);

        //加强类设置回调对象来拦截代理对象方法调用，拦截到后，用这个回调对象的intercept方法增强原方法调用，（也就是添加一些操作）
        enhancer.setCallback(new Proxy());

        //创建代理对象（这里的helloWorld才叫做代理对象）
        HelloWorld helloWorld = (HelloWorld) enhancer.create();

        helloWorld.say();

    }
}

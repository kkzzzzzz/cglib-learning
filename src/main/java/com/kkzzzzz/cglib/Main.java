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

        Enhancer enhancer = new Enhancer();

        //代理类需要继承目标类，（使用的是extend实现代理）
        enhancer.setSuperclass(HelloWorld.class);

        //加强类设置代理类，当拦截到目标类的方法调用，用这个代理的intercept方法对原方法加强
        enhancer.setCallback(new Proxy());

        //创建代理对象（这里的helloWorld才叫做代理对象）
        HelloWorld helloWorld = (HelloWorld) enhancer.create();

        helloWorld.say();

    }
}

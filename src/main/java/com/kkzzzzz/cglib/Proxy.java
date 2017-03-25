package com.kkzzzzz.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * Project: cglib-leanring
 * Author: Kevin
 * Date: 2017/3/25
 * Time: 下午7:44
 */
public class Proxy implements MethodInterceptor {

	public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

		System.out.println("do something before invoke, like log...");

		methodProxy.invokeSuper(object, args);

		System.out.println("do something after invoke, like log...");

		return null;
	}
}

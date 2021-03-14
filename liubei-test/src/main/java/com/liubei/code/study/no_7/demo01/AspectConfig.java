package com.liubei.code.study.no_7.demo01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * TODO
 *
 * @Author ltb
 * @Date 2021/3/14 2:04 下午
 * @Version 1.0
 */
@Aspect
public class AspectConfig {
	/**
	 * 如何定义一个切点？
	 * 切点位置： com.liubei.code 包下的所有class 的所有 test结尾的方法。
	 */

	@Pointcut(value = "execution(* com.liubei.code..*.*Test(..))")
	public void test(){}

	/**
	 * 定义一个前置通知
	 */
	@Before(value = "test()")
	public void beforeAdvice(){
		System.out.println("before advice");
	}

	/**
	 * 定义一个后置通知
	 */
	@After(value = "test()")
	public void AfterAdvice(){
		System.out.println("after advice");
	}

	/**
	 * 定义一个环绕通知
	 */
	@Around(value = "execution(* com.liubei.code..*.*Test(..))")
	public void aroundAdvice(ProceedingJoinPoint joinPoint){
		try{
			System.out.println("around advice begin");
			joinPoint.proceed();
			System.out.println("around advice end");
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
	}
}

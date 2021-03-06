package com.liubei.code.study.no_5.lifecycle;

import org.springframework.context.Lifecycle;

/**
 * TODO
 *
 * @Author ltb
 * @Date 2021/3/7 1:01 上午
 * @Version 1.0
 */
public class DemoOneLifeCycle implements Lifecycle {

	private boolean running = false;

	@Override
	public void start() {
		this.running = true;
		System.out.println("demo one start!!");
	}

	@Override
	public void stop() {
		this.running = false;
		System.out.println("demo one stop!!");
	}

	@Override
	public boolean isRunning() {
		return running;
	}
}

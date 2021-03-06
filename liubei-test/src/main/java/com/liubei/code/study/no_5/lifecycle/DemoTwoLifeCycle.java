package com.liubei.code.study.no_5.lifecycle;

import org.springframework.context.SmartLifecycle;

/**
 * TODO
 *
 * @Author ltb
 * @Date 2021/3/7 1:01 上午
 * @Version 1.0
 */
public class DemoTwoLifeCycle implements SmartLifecycle {

	private boolean running = false;

	@Override
	public void start() {
		this.running = true;
		System.out.println("demo two start!!");
	}

	@Override
	public void stop() {
		this.running = false;
		System.out.println("demo two stop!!");
	}

	@Override
	public boolean isRunning() {
		return running;
	}
}

package com.liubei;

import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @Author ltb
 * @Date 2021/2/4 5:30 下午
 * @Version 1.0
 */
public class ComponentA {

	private ComponentB componentB;

	public ComponentA(ComponentB componentB){
		this.componentB = componentB;
	}
}

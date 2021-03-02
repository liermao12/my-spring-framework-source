package com.liubei.code.study.no_5.bfpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionVisitor;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.util.StringValueResolver;

import java.util.Set;

/**
 * TODO
 *
 * @Author: ltb
 * @Date: 2021/3/2 19:16
 * @Version: 1.0
 */
public class ReplaceObscenitiesBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	private Set<String> obscenites;

	public ReplaceObscenitiesBeanFactoryPostProcessor(Set<String> obscenites) {
		this.obscenites = obscenites;
	}

	public void setObscenites() {
		this.obscenites.clear();
		for (String obscenity : obscenites) {
			this.obscenites.add(obscenity);
		}
	}


	public boolean isObscene(Object value) {
		String upperWord = value.toString().toUpperCase();
		return this.obscenites.contains(upperWord);
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		String[] beanNames = beanFactory.getBeanDefinitionNames();
		for (String beanName : beanNames) {
			BeanDefinition bd = beanFactory.getBeanDefinition(beanName);
			StringValueResolver valueResolver = new StringValueResolver() {
				@Override
				public String resolveStringValue(String strVal) {
					if(isObscene(strVal)){
						return  "*****";
					}
					return strVal;
				}
			};
			BeanDefinitionVisitor visitor = new BeanDefinitionVisitor(valueResolver);
			visitor.visitBeanDefinition(bd);
		}
	}


}

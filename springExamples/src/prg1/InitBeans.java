package prg1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitBeans implements BeanPostProcessor{
	public Object postProcesssBeforeInitialization(Object bean,String beanName) throws BeansException
	{
		System.out.println("Before Initialization");
		return bean;
	}
	public Object postProcesssAfterInitialization(Object bean,String beanName) throws BeansException
	{
		System.out.println("After Initialization");
		return bean;
	}

}
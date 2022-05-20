package top.lljieeeeee.springframework.beans.factory.support;

import top.lljieeeeee.springframework.beans.BeansException;
import top.lljieeeeee.springframework.beans.factory.config.BeanDefinition;

/**
 * @author liuluojie
 * @date 2022/5/20 14:37
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        return doCreateBean(beanName, beanDefinition);
    }

    protected Object doCreateBean(String beanName, BeanDefinition beanDefinition) {
        Class beanClass = beanDefinition.getBeanClass();
        Object bean = null;
        try {
            bean = beanClass.newInstance();
        } catch (Exception e) {
            throw new BeansException("Instantiation of bean failed", e);
        }
        registerSingletonBean(beanName, bean);
        return bean;
    }
}

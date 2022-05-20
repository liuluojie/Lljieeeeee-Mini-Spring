package top.lljieeeeee.springframework.beans.factory.support;

import top.lljieeeeee.springframework.beans.BeansException;
import top.lljieeeeee.springframework.beans.factory.BeanFactory;
import top.lljieeeeee.springframework.beans.factory.config.BeanDefinition;

import java.util.Objects;

/**
 * @author liuluojie
 * @date 2022/5/20 14:27
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String beanName) throws BeansException {
        Object bean = getSingletonBean(beanName);
        if (!Objects.isNull(bean)) {
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        return createBean(beanName, beanDefinition);
    }

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;
}

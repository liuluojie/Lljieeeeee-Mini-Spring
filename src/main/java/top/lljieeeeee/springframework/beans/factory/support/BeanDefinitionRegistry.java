package top.lljieeeeee.springframework.beans.factory.support;

import top.lljieeeeee.springframework.beans.factory.config.BeanDefinition;

/**
 * BeanDefinition注册表接口
 * @author liuluojie
 * @date 2022/5/20 14:39
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
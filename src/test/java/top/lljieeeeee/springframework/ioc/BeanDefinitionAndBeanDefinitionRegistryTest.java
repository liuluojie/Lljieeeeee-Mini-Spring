package top.lljieeeeee.springframework.ioc;

import org.junit.Test;
import top.lljieeeeee.springframework.beans.factory.config.BeanDefinition;
import top.lljieeeeee.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author liuluojie
 * @date 2022/5/20 14:05
 */
public class BeanDefinitionAndBeanDefinitionRegistryTest {

    @Test
    public void testBeanFactory() throws Exception {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(HelloService.class);
        beanFactory.registerBeanDefinition("helloService", beanDefinition);
        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        helloService.sayHello();
    }
}

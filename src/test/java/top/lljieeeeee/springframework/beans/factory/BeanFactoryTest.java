package top.lljieeeeee.springframework.beans.factory;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author liuluojie
 * @date 2022/5/20 14:05
 */
public class BeanFactoryTest {

    @Test
    public void testGetBean() {
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.registerBean("helloService", new HelloService());
        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        assertThat(helloService).isNotNull();
        assertThat(helloService.sayHello()).isEqualTo("hello");
    }

    class HelloService {
        public String sayHello() {
            System.out.println("hello");
            return "hello";
        }
    }
}
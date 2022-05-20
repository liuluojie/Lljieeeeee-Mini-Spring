package top.lljieeeeee.springframework.beans.factory.config;

/**
 * 单例注册表
 *
 * @author liuluojie
 * @date 2022/5/20 14:21
 */
public interface SingletonBeanRegistry {

    /**
     * 获取单例bean
     * @param beanName
     * @return
     */
    Object getSingletonBean(String beanName);
}

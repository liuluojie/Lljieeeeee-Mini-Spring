package top.lljieeeeee.springframework.beans.factory.support;

import top.lljieeeeee.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liuluojie
 * @date 2022/5/20 14:24
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String, Object> singletonBeanMap = new HashMap<>();

    @Override
    public Object getSingletonBean(String beanName) {
        return singletonBeanMap.get(beanName);
    }

    protected void registerSingletonBean(String beanName, Object singletonBean) {
        singletonBeanMap.put(beanName, singletonBean);
    }
}

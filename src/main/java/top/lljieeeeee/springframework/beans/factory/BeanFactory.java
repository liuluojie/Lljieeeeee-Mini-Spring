package top.lljieeeeee.springframework.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liuluojie
 * @date 2022/5/20 14:02
 */
public class BeanFactory {

    private Map<String, Object> beanMap = new HashMap<>();

    public void registerBean(String name, Object bean) {
        beanMap.put(name, bean);
    }

    public Object getBean(String name) {
        return beanMap.get(name);
    }
}

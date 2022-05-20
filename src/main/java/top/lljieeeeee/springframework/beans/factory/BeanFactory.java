package top.lljieeeeee.springframework.beans.factory;

import top.lljieeeeee.springframework.beans.BeansException;

/**
 * bean容器
 *
 * @author liuluojie
 * @date 2022/5/20 14:02
 */
public interface BeanFactory {

    /**
     * 获取bean
     *
     * @param beanName
     * @return
     * @throws BeansException bean不存在时抛异常
     */
    Object getBean(String beanName) throws BeansException;
}

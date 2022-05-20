package top.lljieeeeee.springframework.beans;

/**
 * @author liuluojie
 * @date 2022/5/20 14:17
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}


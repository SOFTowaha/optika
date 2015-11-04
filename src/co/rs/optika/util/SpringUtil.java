package co.rs.optika.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringUtil {

    private static SpringUtil springUtil;
    private ApplicationContext applicationContext;

    private SpringUtil() {
        try {
            applicationContext = new ClassPathXmlApplicationContext("applicationContex.xml");
        } catch (Exception ex) {
            System.err.println("SpringUtil constructor exception : " + ex);
        }
    }

    private static SpringUtil getSpringUtil() {
        if (springUtil == null) {
            springUtil = new SpringUtil();
        }
        return springUtil;
    }

    public static <T extends Object> T getBean(String beanName, Class<T> type) {
        try {
            return type.cast(getSpringUtil().applicationContext.getBean(beanName));
        } catch (Exception ex) {
            System.err.println("SpringUtil.getBean(String beanName[" + beanName + "], Class<T> type[" + type.getName() + "]) : " + ex);
        }
        return null;
    }
}

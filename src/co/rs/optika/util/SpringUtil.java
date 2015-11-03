package co.rs.optika.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringUtil {

    private static SpringUtil springUtil;
    private ApplicationContext applicationContext;

    private SpringUtil() {
        applicationContext = new ClassPathXmlApplicationContext("applicationContex.xml");
    }

    private static SpringUtil getSpringUtil() {
        if (springUtil == null) {
            springUtil = new SpringUtil();
        }
        return springUtil;
    }

    public static Object getBean(String beanName){
        return getSpringUtil().applicationContext.getBean(beanName);
    }
}

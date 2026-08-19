package dbutil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KSR {
    
    public static KSR_DAO getContext() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("dbutil/springconfig.xml");
        return (KSR_DAO)ac.getBean("ksrdao");
    }
}

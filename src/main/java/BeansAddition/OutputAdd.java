package BeansAddition;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OutputAdd {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringConfig.xml");
        Addition addition = (Addition) applicationContext.getBean("addition");
        addition.intAddition(89,90);
        addition.changeDouble(78.00,90.00);
        addition.changeString("90","89");
    }
}

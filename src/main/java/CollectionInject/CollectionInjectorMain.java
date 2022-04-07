package CollectionInject;

import BeansAddition.Addition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionInjectorMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("BeanConfig.xml");
        CollectionInjectorEx collectionInjector = (CollectionInjectorEx) applicationContext.getBean("collectionInjector");

        System.out.println(collectionInjector.getAddress());
        System.out.println(collectionInjector.getCollege());
    }
}

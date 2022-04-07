package Student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollegeStudentMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("College.xml");
        College college = (College) applicationContext.getBean("SC");
        System.out.println(college);
    }
}

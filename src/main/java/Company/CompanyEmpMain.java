package Company;

import Student.College;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CompanyEmpMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Company.xml");
        CompanyEmp companyEmp = (CompanyEmp) applicationContext.getBean("companyEmployee");
        System.out.println(companyEmp);
    }
}



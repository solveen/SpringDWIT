package Company;

import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLOutput;

public class Company {
    private int emp_id;
    private String emp_name;

    public Company(int emp_id, String emp_name) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        System.out.println("Calling from constructor");
    }
    public Company(){

    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }


    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;

    }

    @Override
    public String toString() {
        return "Company{" +
                "emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                '}';
    }
}

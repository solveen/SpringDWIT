package Company;

import org.springframework.beans.factory.annotation.Autowired;

public class CompanyEmp {
    //Autowiring
    @Autowired
    Company company;

    //there should always be non arg constructor and arg constructor and setter, getter inorder for bean to insert value
    //setter getter ra constructor ma milxa, primitive and string ma mildaina
    @Autowired
    public CompanyEmp(Company company) {
        this.company = company;
        System.out.println("Calling from constructor");
    }

    public CompanyEmp(){

    }
    public Company getCompany() {
        return company;
    }

    @Autowired
    public void setCompany(Company company) {
        this.company = company;
        System.out.println("Calling from setter");
    }

    @Override
    public String toString() {
        return "CompanyEmp{" +
                "company=" + company +
                '}';
    }
}

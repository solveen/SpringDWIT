package Student;

public class College {
    Student student;

    public College(){

    }
    public College(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "College{" +
                "student=" + student +
                '}';
    }
}

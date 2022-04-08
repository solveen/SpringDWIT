package BeansAddition;

public class Addition {

    public int a = 2;
    public int b = 3;


    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("This is calling from int");
    }

    public Addition(double a, double b) {
        this.a = (int) a;
        this.b = (int) b;
        System.out.println("Calling from Double:");

    }

    public Addition(String a, String b) {
        this.a = Integer.parseInt(a);
        this.a = Integer.parseInt(b);
        System.out.println("Calling from String:");
    }

    public void addNumber() {
        System.out.println("Addition of two numbers: " + (this.a + this.b));
    }

    @Override
    public String toString() {
        return "Addition{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}


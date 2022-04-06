package BeansAddition;

public class Addition {

    public int a = 2;
    public int b = 3;


    public Addition(int a, int b) {
        this.a = a;
        this.b = b;

    }

    public void intAddition(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("This is calling from int");
        this.addNumber();
    }

    public void changeDouble(double a, double b) {
        this.a = (int) a;
        this.b = (int) b;
        System.out.println("Calling from Double:");
        this.addNumber();

    }

    public void changeString(String a, String b) {
        this.a = Integer.parseInt(a);
        this.a = Integer.parseInt(b);
        System.out.println("Calling from String:");
        this.addNumber();

    }

    public void addNumber() {
        System.out.println("Addition of two numbers: " + (this.a + this.b));
    }
}


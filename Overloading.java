class Calci  {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Overloading {
    public static void main(String[] args) {
        Calci c = new Calci();

        System.out.println(c.add(10, 20));
        System.out.println(c.add(10, 20, 30));
    }
}

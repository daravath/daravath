public class StaticExample {
    static int StaticField = 10;
    int nonStaticField = 20;

    public static void main(String[] args) {

        StaticExample StaticExample = new StaticExample();
        StaticExample.StaticField = 20;
        StaticExample.nonStaticField = 30;

        StaticExample StaticExample1 = new StaticExample();
        System.out.println("Static value: " + StaticExample1.StaticField);
        System.out.println("Non Static value: " + StaticExample1.nonStaticField);

    }
}


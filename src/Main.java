public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int store = helperMain(2,5);
        System.out.println(store);

        Extra ex = new Extra();
        ex.print();

    }

    public static int helperMain(int add1, int add2)
    {
        return add1 + add2;
    }
}
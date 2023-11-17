public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int store = helperMain(2,5);
        System.out.println(store);


        Extra ex = new Extra();
        ex.print();

        Extra2 ex2 = new Extra2();
        int multipleResult = ex2.multiply(5, 5);
        System.out.print(multipleResult);


    }

    public static int helperMain(int add1, int add2)
    {
        return add1 + add2;
    }
}
package java8prog1;

public class MyClass {

    public static void main(String[] args) {
        int[] x[] = { { 11, 22 }, { 33, 44, 55 }, { 66, 77, 88, 99 } };
        int[][] y = x;
        System.out.println(y[2][2]);
    }
}

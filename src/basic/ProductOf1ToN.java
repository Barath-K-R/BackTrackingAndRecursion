package basic;

public class ProductOf1ToN {
    public static int product(int n) {
        if (n == 0)
            return 1;
        return n * product(n - 1);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println( product(n));
       
    }
}

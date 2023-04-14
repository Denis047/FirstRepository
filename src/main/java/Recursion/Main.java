package Recursion;

public class Main {
    public static void main(String[] args) {
    counter(3);
        System.out.println(fac(5));
    }
    public static void counter(int n){
        if (n == 0)
            return;
        System.out.println(n);
        counter(n - 1);

    }
    public static int fac(int i){
        if (i == 0)
            return 1;
        return i * fac(i - 1);
    }

}

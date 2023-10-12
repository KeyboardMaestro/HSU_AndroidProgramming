package week5;

public class RecursionFactorial {
    public static void main(String[] args) {
        System.out.println(facto(100));
    }

    public static int facto(int n){
        if (n == 1)
            return 1;
        return n * facto(n-1);
    }

}

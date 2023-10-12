package week5;

import java.util.ArrayList;
import java.util.List;

public class Recursive {

    private static List<Integer> factorial;

    public static void main(String[] args) {
        factorial = new ArrayList<>();
        factorial.add(1);
        System.out.println(facto(3));
        for (Integer n : factorial)
            System.out.println(n);
    }

    public static int facto(int n){
        if (n == 1)
            return 1;
        if (n <= factorial.size()-1)
            return factorial.get( n);
        factorial.add(n);
        return n * facto(n-1);
    }
}

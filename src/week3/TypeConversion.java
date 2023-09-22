package week3;

public class TypeConversion {
    public static void main(String[] args) {
        int i;
        double f;

        f = 1 / 5;
        System.out.println(f);

        f = (double) 1 / 5;
        System.out.println(f);

        i = (int) 1.7 + (int)1.8;
        System.out.println(i);

        long longn = 3;

        float floatn = 3.0f;

        long result = longn + (long)floatn;

        float result2 = longn + floatn;

        System.out.println((int)12.3 + (double)10);
    }
}

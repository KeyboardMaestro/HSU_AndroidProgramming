package week3;

public class WhichPizza {
    public static void main(String[] args) {
        double area1 = 20 * 20 * 3.14 * 2;
        double area2 = 30 * 30 * 3.14;
        System.out.println("20cm 피자 면적 " + area1);
        System.out.println("30cm 피자 면적 " + area2);
        System.out.println((area1 >= area2) ? "20짜리 두개" : "30짜리 한개");
    }
}

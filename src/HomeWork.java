public class HomeWork {
    public static void main(String[] args) {
        // 예제 2.8
        comparisonOperator();
        // 예제 2.9
        bitOperator();
        // 예제 2.10
        bitOperator2();
        // 예제 2.11
        pizza();
    }

    public static void comparisonOperator() { // 예제 2.8
        System.out.println("예제 2장 8번 입니다.");

        System.out.print((3 == 4) + " ");
        System.out.print((3 != 4) + " ");
        System.out.print((3 > 4) + " ");
        System.out.print((4 > 3) + " ");

        System.out.print((3 == 4 &&  4 ==7 ) + " ");
        System.out.println((3 == 4 ||  4 ==7 ) + " ");
    }

    public static void bitOperator() { //예제 2.9
        System.out.println("예제 2장 9번 입니다.");

        byte status = 0b01101110;
        System.out.println("문열림 상태=" + ((status & 0b00000100)!= 0));
    }

    public static void bitOperator2() { //예제 2.10
        System.out.println("예제 2장 10번 입니다.");

        int x = 0b00001101;
        int y = 0b00001010;

        System.out.println("x & y = " + Integer.toBinaryString(x&y));
        System.out.println("x | y = " + Integer.toBinaryString(x|y));
        System.out.println("x ^ y = " + Integer.toBinaryString(x^y));
        System.out.println("~ x   = " + Integer.toBinaryString(~x));
        System.out.println("x>>1  = " + Integer.toBinaryString(x>>1));
        System.out.println("x<<1  =" + Integer.toBinaryString(x<<1));
        System.out.println("x>>>1 =" + Integer.toBinaryString(x>>>1));
    }

    public static void pizza() { //에제 2.11
        System.out.println("예제 2장 11번 입니다.");

        double area1 = 20 * 20 * 3.14 * 2;
        double area2 = 30 * 30 * 3.14;
        System.out.println("20cm 피자 면적 " + area1);
        System.out.println("30cm 피자 면적 " + area2);
        System.out.println((area1 >= area2) ? "20짜리 두개" : "30짜리 한개" + "를 주문하세요");
    }
}

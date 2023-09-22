package week3;

import java.util.Scanner;

public class Timer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("초를 입력하시오: ");
        int seconds = scanner.nextInt();
        System.out.println(seconds+ "초는 "+ seconds/60 +"분 " + seconds%60 + "초입니다.");
        scanner.close();
    }
}

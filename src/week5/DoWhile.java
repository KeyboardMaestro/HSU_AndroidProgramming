package week5;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month;
        do {
            System.out.print("올바른 달을 입력하시오 : ");
            month = scanner.nextInt();
        }while (month > 12 || month < 1);
        System.out.println(month);
    }
}

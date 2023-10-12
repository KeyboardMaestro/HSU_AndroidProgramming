package week5;

import java.util.Scanner;

public class Example3_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int sum = 0;
        while (input != -1){
            sum += input;
            System.out.print("정수를 입력하시오: ");
            input = scanner.nextInt();
        }

        System.out.println("정수의 합은 " + sum + "입니다.");
    }
}

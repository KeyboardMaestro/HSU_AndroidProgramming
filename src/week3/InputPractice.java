package week3;

import java.util.Scanner;

public class InputPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력하시오 ");
        int n1 = scanner.nextInt();
        System.out.print("두번째 숫자를 입력하시오 ");
        int n2 = scanner.nextInt();

        int sum = n1 + n2;

        System.out.print("첫번째 소수를 입력하시오 ");
        double n3 = scanner.nextDouble();

        System.out.print("두번째 소수를 입력하시오 ");
        double n4 = scanner.nextDouble();

        double doubleSum = n3 + n4;

        System.out.println(sum);
        System.out.println(doubleSum);

        System.out.println("한국이름을 입력하세요");
        String name = scanner.next();

        if (scanner.hasNext())
            scanner.nextLine();

        System.out.println("영문이름을 입력하세요");
        String englishName = scanner.nextLine();


        System.out.println(name);

        System.out.println(englishName);
        scanner.close();
    }
}

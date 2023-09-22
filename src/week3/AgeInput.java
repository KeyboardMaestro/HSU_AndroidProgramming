package week3;

import java.util.Scanner;

public class AgeInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하시오: ");
        String name = scanner.next();
        if (scanner.hasNext())
            System.out.println(scanner.nextLine());
        System.out.print("나이를 입력하시오: ");
        int age = scanner.nextInt();
        if (scanner.hasNext())
            System.out.println(scanner.nextLine());
        System.out.print("키를 입력하시오: ");
        double height = scanner.nextDouble();
        if (scanner.hasNext())
            System.out.println(scanner.nextLine());
        System.out.println(name+"님 "+"안녕하세요! " + age + "살이시고, 키는 " +height+"m 이시네요.");
    }
}
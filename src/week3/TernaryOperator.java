package week3;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("나이를 입력하시오 : ");
        int age = scanner.nextInt();
        String isAdult = (age >= 18) ? "성인" : "미성년자";

        if(scanner.hasNext())
            scanner.nextLine();

        System.out.print("로그인 상태를 입력하시오 (true/false): ");
        boolean isLogOn = scanner.nextBoolean();
        String loginStatus = (isLogOn) ? "로그인중" : "로그아웃 상태";

        if(scanner.hasNext())
            scanner.nextLine();

        System.out.print("멤버 여부를 입력하시오 (true/false): ");
        boolean isMember = scanner.hasNextBoolean();
        String discountPercent = (isMember) ? "할인율 10%" : "할인율 0%";

        if(scanner.hasNext())
            scanner.nextLine();

        System.out.print("점수를 입력하시오 : ");
        int score = scanner.nextInt();
        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : "D";

        System.out.println("1. " + isAdult);
        System.out.println("2. " + loginStatus);
        System.out.println("3. " + discountPercent);
        System.out.println("4. " + grade);

        scanner.close();
    }
}

package week3;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하시오 ");
        String name = scanner.nextLine();
        System.out.print("학번을 입력하시오 ");
        int studentID = scanner.nextInt();
        System.out.print("평점을 입력하시오 ");
        double gpa = scanner.nextDouble();
        System.out.print("등급을 입력하시오 ");
        String grade = scanner.next();

        System.out.println(name + " " +studentID + " " + gpa + " " + grade);

        scanner.close();
    }
}

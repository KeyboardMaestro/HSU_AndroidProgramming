package week3;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        final double PI = 3.141592;

        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double area = Math.pow(radius, 2) * PI;

        System.out.println("반지름이 " + radius +" 인 원의 면적은 " + area);
    }
}

package week5;

import java.util.Scanner;

public class DPFactorial {
    public static void main(String[] args) {
        long facto = 1;
        long facto2 = 1;
        int n;

        System.out.print("정수를 입력하시오 : ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for(int i = 1; i <= n; i++){
            facto *= i;
        }

        for(int i = n; i >= 1; i--){
            facto2 *= i;
        }

        System.out.println(n+"!은 "+facto+" 입니다. (증가식)");
        System.out.println(n+"!은 "+facto2+" 입니다. (감소식)");
    }
}

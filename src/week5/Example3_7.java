package week5;

public class Example3_7 {
    public static void main(String[] args) {
        int sum = 0,sum1 = 0,sum2 = 0;
        for (int i = 1; i <= 10; i++){
            sum += i;
        }
        System.out.println("1 ~ 10 까지의 합은 " + sum + " 입니다.");

        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0)
                sum2 += i;
            else
                sum1 += i;
        } // 홀수 와 짝수 합을 구하는 변형 문제
        System.out.println("1 ~ 100 까지의 짝수 합은 " + sum2 + " 입니다.");
        System.out.println("1 ~ 100 까지의 홀수 합은 " + sum1 + " 입니다.");
    }
}

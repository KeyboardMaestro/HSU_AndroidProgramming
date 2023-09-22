package week2.ex01; // 패키지

public class AddTwo { // 클래스 정의
    public static void main(String[] args) { // 메소드 정의
        int x = 100; // 정수형 변수 x 선언후 100으로 초기화
        int y = 200; // 정수형 변수 y 선언후 100으로 초기화
        int sum = x + y; // 정수형 변수 sum 선언후 x + y 값 으로 초기화
        System.out.println(sum); // sum 에 저장된 값 출력
        System.out.println("Using addExact method in Math class : " + addition(x,y));
    }

    public static int addition(int x, int y){
        return x + y;
    }
}

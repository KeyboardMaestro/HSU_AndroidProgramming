package week5;

public class WhileHello {
    public static void main(String[] args) {
        int loop = 5;
        int reps = 0;
        while (reps < loop){
            System.out.println("환영 합니다.");
            reps++;
        }
        System.out.println("While 반복이 종료되었습니다.");

        for (int i = 0; i < loop; i++){
            System.out.println("환영 합니다.");
        }
        System.out.println("For 반복이 종료 되었습니다.");

    }
}

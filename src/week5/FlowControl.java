package week5;

public class FlowControl {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            if (i == 4)
                continue;
            else if (i == 7) {
                break;
            }
            System.out.print(i + " ");
        }
    }
}


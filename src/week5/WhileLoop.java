package week5;

public class WhileLoop {
    public static void main(String[] args) {
        int number = 10;

        int counter = 0;

        while (++counter <= number){
            System.out.print(counter + " ");
        }
        System.out.println();
        while (--counter >= 1){
            System.out.print(counter + " ");
        }

    }
}

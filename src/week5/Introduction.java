package week5;

public class Introduction {
    public static void main(String[] args) {
        String[] me = new String[]{"박성원", "24", "프로그래밍", "키보드", "180"};
        String[] me1 = new String[5];
        String[] me2;
        me2 = new String[5];
        String[] me3 = {"박성원", "24", "프로그래밍", "키보드", "180"};

        System.out.println("length로 반복");
        for (int i = 0; i < me.length; i++){
            System.out.println(me[i]);
        }
        System.out.println("그냥 숫자로 반복");
        for (int i = 0; i < 5; i++){
            System.out.println(me[i]);
        }
        System.out.println("for each로 반복");
        for (String token : me)
            System.out.println(token);
    }

}

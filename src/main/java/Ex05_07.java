import java.util.Scanner;

public class Ex05_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();


        if (a>50) {
            if(a<100){
                System.out.printf("50보다 크고 100보다 작군요..\n");
            } else {
                System.out.printf("와~ 100보다 크군요..\n");
            }
        } else {
            System.out.printf("에게~ 50보다 작군요..\n");
        }
    }
}

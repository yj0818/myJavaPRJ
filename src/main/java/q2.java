import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        a = s.nextInt();

        if(a/2==0){
            System.out.printf("짝수입니다.");
        } else{
            System.out.printf("홀수입니다.");
        }
    }
}

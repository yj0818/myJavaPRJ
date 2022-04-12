import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        a = s.nextInt();
        int c = 0;

        for(int b = 1; b <= a; b++){
            if(b % 2== 0) {
                c = c + b;
            }
        }
        System.out.println(c);
    }
}

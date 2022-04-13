import java.util.Scanner;

public class q0 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        a = s.nextInt();
        int c = 1;

        for(int b = 1; b<=a; b++){
            c = c * b;
        }
        System.out.println(c);

    }
}

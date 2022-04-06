import java.util.Scanner;

public class ex0 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i;
        int a;
        a = s.nextInt();
        int n = 0;

        for(i=1; i<=a; i++) {
            if(i % 2 == 0)
                System.out.println(i);
                n += i;

        }

        System.out.printf("%d\n", n);
    }
}

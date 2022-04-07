import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        int z = 0;
        System.out.printf("숫자를 입력하시오:");

        a = s.nextInt();


        for(int i=1; i<=9; i++) {
            z = a * i;
            System.out.printf("%d * %d = %d \n", a, i, z);
        }

    }

}

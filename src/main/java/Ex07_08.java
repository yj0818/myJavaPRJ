import java.util.Scanner;

public class Ex07_08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b;

        while(true){
            System.out.printf("첫수 : ");
            a = s.nextInt();;
            System.out.printf("주번째수 :");
            b = s.nextInt();

            if (a==0)
                break;

            System.out.printf("%d = %d = %d \n",a ,b, a+b);
        }
    }
}

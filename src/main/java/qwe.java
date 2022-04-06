import java.util.Scanner;

public class qwe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();

        a = a % b;

        System.out.println(a);
    }
}

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        a = s.nextInt();


        for(int i = 1; i<=a; i++){
            for(int j = i; a-j >0; j++)
                System.out.printf(" ");
            for (int z = 0; z < i; z++)
                    System.out.printf("*");
                    System.out.println();
        }
    }
}

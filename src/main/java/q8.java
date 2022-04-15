import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        a = s.nextInt();

        for(int b = 1; b<=a; b++){
            if(b%3==0){
                System.out.printf("X\n");
            }else
                System.out.println(b);
        }
    }
}

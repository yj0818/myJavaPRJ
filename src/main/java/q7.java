import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        a = s.nextInt();

        for(int b = 1; b<=a; b++){
            if(a%b==0){
                System.out.println(b);
            }
        }
    }
}

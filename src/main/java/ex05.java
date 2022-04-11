import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        a = s.nextInt();


        for(int i = 1; i<=a; i++){
            for (int j = a; j>0; j--) {
                if(i<j){
                    System.out.printf("-");
                }else {
                    System.out.printf("*");
                }
            }
            System.out.println();
        }
    }
}


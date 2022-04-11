import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        a = s.nextInt();

        for(int b = 1; b<a; b++){
            for (int c = a; c>0; c--) {
                    if(b<c){
                        System.out.printf(" ");
                    } else{
                        System.out.printf("*");
                    }
            }
            System.out.println();
        }
    }
}

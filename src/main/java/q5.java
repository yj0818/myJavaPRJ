import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b;
        a = s.nextInt();
        b = s.nextInt();
        int d,e = 0;

        for(int c = a; c<=b; c++){
            d = e + c;
            if(c%2==0){
                e-=c;
            }else{
                e+=c;
            }
        }
        System.out.println(e);

    }
}

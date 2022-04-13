public class q3 {
    public static void main(String[] args) {

        int b=0;

        for(int a = 1; a<101; a++){
            if(a%5==0 || a%3==0)
                b= b+a;
        }
        System.out.println(b);

    }
}

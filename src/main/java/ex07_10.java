public class ex07_10 {
    public static void main(String[] args) {
        int hap = 0;
        int i;


        for(i = 1; i<101; i++){
            if(i%3==0)
                continue;

            hap+=i;
        }
        System.out.printf("1~100(3배제외): %d\n",hap);
    }
}

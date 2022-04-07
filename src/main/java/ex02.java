public class ex02 {
    public static void main(String[] args) {
        int z=0;

        for(int a=2; a<=9; a++)
        for(int i=1; i<=9; i++){
            z = a * i;
            System.out.printf("%d * %d = %d \n", a, i, z);
            if(i == 9) {
                System.out.printf("------------ \n");
            }
        }

    }
}

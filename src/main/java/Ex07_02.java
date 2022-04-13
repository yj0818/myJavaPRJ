public class Ex07_02 {
    public static void main(String[] args) {
        int i;
        int hap = 0;

        i = 1;
        while(i<11){
            hap=hap +i;
            i++;
        }
        System.out.printf("1~10의 합:%d \n", hap);
    }
}

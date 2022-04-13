public class Ex06_14 {
    public static void main(String[] args) {
        int i,k;

        for(i=1; i<10; i++){
            for(k=2; k<10; k++){
                System.out.printf("%3d x %d = %2d", i, k, i*k);
            }
            System.out.printf("\n");
        }
    }
}

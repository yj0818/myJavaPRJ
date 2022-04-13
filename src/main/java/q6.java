import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        int star = 1;
        int blink = n-1;
        int line = n*2-1;

        for (int i = 0; i < line; i++) {//줄 반복
            if (i < n-1) {//* 증가
                for (int j = 0; j < blink; j++) {//공백 개수 반복
                    System.out.print(" ");
                }
                for (int j = 0; j < star; j++) {//* 의 개수 반복
                    System.out.print("*");
                }
                for (int j = 0; j < blink; j++) {//공백 개수 반복
                    System.out.print(" ");
                }
                System.out.println();//줄바꿈
                star = star + 2;//* 개수 2개씩 증가
                blink--;//공백 개수1씩 감소( 공백은 대칭 적용)
            } else {//* 감소
                for (int j = 0; j < blink; j++) {//공백 개수 반복
                    System.out.print(" ");
                }
                for (int j = 0; j < star; j++) {//*개수 반복
                    System.out.print("*");
                }
                for (int j = 0; j < blink; j++) {//공백 개수 반복
                    System.out.print(" ");
                }
                System.out.println();//줄바꿈
                star = star - 2;//*개수 2개씩 증가
                blink++;//공백 개수 1씩 증가( 공백은 대칭적용)
            }
        }
    }
}

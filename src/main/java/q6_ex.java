public class q6_ex {
    public static void main(String[] args) {
        int star = 1 ;//* 개수
        int blink = 4 ;//공백 개수


        for(int i = 0 ; i < 9 ; i++) {//줄 반복
            if(i < 4) {//* 증가
                for(int j = 0; j < blink; j++){//공백 개수 반복
                    System.out.print(" ");
                }
                for(int j = 0 ; j < star ; j++) {//* 의 개수 반복
                    System.out.print("*");
                }
                for(int j = 0 ; j < blink ; j++){//공백 개수 반복
                    System.out.print(" ");
                }
                System.out.println();//줄바꿈
                star = star + 2;//* 개수 2개씩 증가
                blink--;//공백 개수1씩 감소( 공백은 대칭 적용)
            } else {//* 감소
                for(int j = 0 ; j < blink ; j++){//공백 개수 반복
                    System.out.print(" ");
                }
                for(int j = 0 ; j < star ; j++) {//*개수 반복
                    System.out.print("*");
                }
                for(int j = 0 ; j < blink ; j++){//공백 개수 반복
                    System.out.print(" ");
                }
                System.out.println();//줄바꿈
                star = star - 2;//*개수 2개씩 증가
                blink++;//공백 개수 1씩 증가( 공백은 대칭적용)
                 }
        }
    }
}

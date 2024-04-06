package ex01;

import java.util.Scanner;

public class 구구단 {
    public static void main(String[] args) {
        System.out.println("원하는 단을 입력하시오");
        Scanner a = new Scanner(System.in);
        int input = a.nextInt();

        System.out.printf("%d단입니다.\n",input);
        for(int b = 1;b<=9;b++) {
            System.out.printf("%d * %d = %d\n",input,b,input*b);

        }
    }
}

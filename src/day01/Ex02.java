package day01;

import java.util.ArrayList;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
        // 다음은 0부터 100까지 숫자 중 하나를 랜덤하게 생성해서
        // num에 저장하는 코드이다.
        Integer num = (int)(Math.random()*100);

        // 위 코드를 활용하여 연금 복권 번호를 생성해보시오.

        for (int i = 0; i < 6; i++) {
            Integer number = (int)(Math.random()*100);
            System.out.print(number + " ");
        }

        System.out.println();
        System.out.println("------------------");
        // 다음 코드를 6번 반복
        //     0부터 9까지 숫자 중 랜덤한 숫자를 하나 생성해서 저장
        //     저장한 숫자를 출력

        for (int i = 0; i < 6; i++) {
            Integer number2 = (int)(Math.random()*9);
            System.out.print(number2 + " ");
        }
    }


        /* 선생님 코드
            Integer num1 = 0;
            while (num1 < 5) {
                Integer num2 = 0;
                while (num2 < 5) {
                    System.out.printf("*");
                    num2 = num2 + 1;
            }
            System.out.println();
            num1 = num1 + 1;
        */

}
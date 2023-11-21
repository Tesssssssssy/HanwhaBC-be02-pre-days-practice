package day02;

import java.util.Arrays;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        // 정수로 된 돈의 액수를 입력 받아
        // 5만원 권, 만원 권, 천원 권, 500원 동전, 100원 동전, 50원 동전, 10원 동전, 1원 동전으로
        // 각각 몇 개씩 변환되는지 출력
        // unit 배열 활용

        int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
        Integer[] step = new Integer[9];
        Arrays.fill(step, 0);
        Scanner scanner = new Scanner(System.in);

        System.out.print("금액을 입력하세요: ");
        int money = scanner.nextInt();

        System.out.println();
        System.out.println("입력한 금액: " + money);

        while (money!=0) {
            step[0] = money / unit[0];
            money = money - step[0] * unit[0];

            step[1] = money / unit[1];
            money = money - step[1] * unit[1];

            step[2] = money / unit[2];
            money = money - step[2] * unit[2];

            step[3] = money / unit[3];
            money = money - step[3] * unit[3];

            step[4] = money / unit[4];
            money = money - step[4] * unit[4];

            step[5] = money / unit[5];
            money = money - step[5] * unit[5];

            step[6] = money / unit[6];
            money = money - step[6] * unit[6];

            step[7] = money / unit[7];
            money = money - step[7] * unit[7];

            step[8] = money / unit[8];
            money = money - step[8] * unit[8];
        }

        for (int i = 0; i < step.length; i++) {
            System.out.print(unit[i] + "원 : ");
            System.out.println(step[i] + "장");
        }
    }

/*
    <출력 결과>
    금액을 입력하세요: 12345

    입력한 금액: 12345
    50000원 : 0장
    10000원 : 1장
    5000원 : 0장
    1000원 : 2장
    500원 : 0장
    100원 : 3장
    50원 : 0장
    10원 : 4장
    1원 : 5장
*/


}
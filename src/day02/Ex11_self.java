package day02;

import java.util.Arrays;

/**
 * 이 방법은 flag를 사용해서 while 문 안에서 중복 처리를 하는 방식
 * 먼저 flag를 true로 설정해 while문을 돌게 하고
 * while문이 실행되자마자 flag를 false로 변경한다.
 * 그리고 while문 안의 for 문에서 중복 발생 시 flag를 true로 설정해 다시 while문을 돌게 한다.
 */

public class Ex11_self {
    public static void main(String[] args) {
        int[] lotto = new int[6];

        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = (int)(Math.random() * 6) + 1;        // 먼저 lotto 배열에 값 초기화
        }

        boolean flag = true;        // while문에 사용될 flag true로 초기화

        while (flag) {
            flag = false;       // flag를 for 문에서 true로 변경해야 하니까 일단 false로 변경

            for (int i = 0; i < 6; i++) {
                for (int j = i + 1; j < 6; j++) {           // 순차탐색하는 개념
                    if (lotto[i] == lotto[j]) {
                        lotto[i] = (int)(Math.random() * 6) + 1;
                        i = 0;          // 중복 값이 존재한다는 의미이므로 위에서 새로 값을 변경해주고 i=0부터 다시 시작
                        flag = true;    // while 문 처음부터 다시 시작하기 위한 flag true로 변경
                    }
                }
            }
        }

        Arrays.sort(lotto);

        System.out.print("로또 번호: ");
        for (int n : lotto) {
            System.out.print(n + " ");
        }
    }
}

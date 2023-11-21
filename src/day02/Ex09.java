package day02;

import java.util.Arrays;

/**
 * Ex08 로또 문제 선생님 풀이 1
 */

public class Ex09 {
    public static void main(String[] args) {
        int lotto[] = new int[6];
        for (int i = 0; i < lotto.length; i++) {        // i = 0, 1, 2, 3, 4, 5
            int randomNum = (int)(Math.random() * 6) + 1;

            for (int j = 0; j < i; j++) {               // j = 0, 1 ,2, 3, 4
                if (lotto[j] == randomNum) {
                    randomNum = (int)(Math.random() * 6) + 1;
                    j = -1;
                }
            }

            // 반복문이 끝났을 때 random한 숫자를 저장하겠다.
            lotto[i] = randomNum;
        }

        Arrays.sort(lotto);

        for (int num : lotto) {
            System.out.print(num + " ");
        }
    }
}

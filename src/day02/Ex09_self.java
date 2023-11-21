package day02;

import java.util.Arrays;

/**
 * i, j로 비교 후 중복 시 새로 random 수를 생성하는 방식
 */
public class Ex09_self {
    public static void main(String[] args) {
        int[] lotto = new int[6];

        for (int i = 0; i < lotto.length; i++) {
            int randomNum = (int)(Math.random() * 6) + 1;
//            for (int j = 1; j < i; j++) {/        // j=1로 시작하면 j=0일 때는 비교할 수 없으므로 중복 발생
                                                    // j < i 이므로 맨 마지막 수는 내비두고 앞 원소들이 겹치는 경우를 없애는 로직
            for (int j = 0; j < i; j++) {
//                if (lotto[i] == lotto[j]) {
                if (lotto[j] == randomNum) {
                    randomNum = (int)(Math.random() * 6) + 1;
                    j = -1;
                }
            }
            lotto[i] = randomNum;
        }

        Arrays.sort(lotto);

        System.out.print("로또 번호: ");
        for (int i : lotto) {
            System.out.print(i + " ");
        }
    }
}

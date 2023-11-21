package day02;

/**
 * 내가 풀다가 해결 못한 로또 문제 코드
 * 아직 중복 제거되지 않은 버전
 */

import java.util.Arrays;

public class Ex08_2 {
    public static void main(String[] args) {

        int[] lotto = new int[6];
        for (int i = 0; i < lotto.length; i++) {
            int tempNum = (int) (Math.random() * 6) + 1;
            if (lotto.equals(tempNum)) {
                tempNum = (int) (Math.random() * 6) + 1;
                i = -1;
            }
            lotto[i] = tempNum;
        }

        Arrays.sort(lotto);

        System.out.print("로또 번호: ");
        for (int lot : lotto) {
            System.out.print(lot + " ");
        }
    }
}

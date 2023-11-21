package day02;

import java.util.Arrays;
import java.util.Random;

/**
 * Ex08 다시 혼자 해보는 용도 file
 *
 * 1-6까지 중복 안되는 것 먼저 확인하고
 * 1-45 random 수 생성 후 저장
 *
 * 일단 random 수를 생성하면서 배열에 할당하는데
 * 배열에 생성한 random 수가 있으면 예외 처리를 해줘야 한다.
 * 그 거르는 작업을 아래에 배열에 새로 생성한 random 수가 있는지 확인 후 true/false 반환하는
 * Boolean method 따로 만들어서 한다.
 *
 */
public class Ex08_self {
    public static void main(String[] args) {
        int[] lotto = new int[6];

        for (int i = 0; i < lotto.length; i++) {
            int randomNum = (int)(Math.random() * 6) + 1;
            if (contain(lotto, randomNum)) {
                randomNum = (int)(Math.random() * 6) + 1;
                i = 0;
            }
            /*
            while (contain(lotto, randomNum) {
                randomNum = (int)(Math.random() * 6) + 1;
            }
            */
            lotto[i] = randomNum;
        }

        Arrays.sort(lotto);

        System.out.print("로또 번호: ");
        for (int i : lotto) {
            System.out.print(i + " ");
        }
    }

    private static boolean contain(int[] array, int num) {
        for (int n : array) {
            if (n == num) {
                return true;
            }
        }
        return false;
    }
}

package day02;

import java.util.Arrays;

/**
 * 로또 번호 생성기 만들기
 * 로또 번호는 1~45 중 중복 없이 6개를 고르는 것
 * 변수, 조건문, 반복문, 배열, 랜덤 생성만 사용할 것
 *
 * 내 버전
 */

public class Ex08 {
    public static void main(String[] args) {

        int[] lotto = new int[6];                           // 로또 번호를 담을 배열 선언
        for (int i = 0; i < lotto.length; i++) {
            int tempNum = (int) (Math.random() * 6) + 1;    // 임시 변수 tempNum에 random 값 할당 (중복 제거된 것 확인한 후 6만 45로 바꿔주면 됨)

            while (contains(lotto, tempNum)) {              // 아래 따로 정의한 메소드 사용해서 lotto 배열에 새로 생성한 random 값 존재 여부 확인
                tempNum = (int) (Math.random() * 6) + 1;    // 만약 lotto 배열에 생성한 tempNum이 있다면 새로 random 값 생성 후 할당
                                                            // 중복 제거 확인 후 6 -> 45로 바꿔주면 됨.
            }
            /*
            if (contain(lotto, randomNum)) {
                randomNum = (int)(Math.random() * 6) + 1;
                i = 0;
            }
            */
            lotto[i] = tempNum;                             // 이제 lotto 배열에 random값 tempNum이 없으니까 lotto 배열에 random 값 할당
        }

        Arrays.sort(lotto);                                 // lotto 배열 오름차순 정렬

        System.out.print("로또 번호: ");
        for (int lot : lotto) {
            System.out.print(lot + " ");
        }
    }

    private static boolean contains(int[] array, int num) {          // array 배열에 num값의 존재 여부 확인 함수
        for (int value : array) {
            if (value == num) {
                return true;                         // 배열에 생성한 random 값이 이미 존재
            }
        }
        return false;                   // 배열에 생성한 random 값이 없는 상태
    }

    /*
       로또 번호: 1 2 3 4 5 6
    */
}

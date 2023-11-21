package day02;

import java.util.Arrays;

/**
 * 이 방법은 처음에 빈 배열에 1-45의 값을 모두 할당해놓고
 * random 수를 생성해서 index로 사용하는 방식
 * 그래서 해당 random 수를 가진 index와 맨 앞 [0] index 값과 위치를 바꾼다.
 * 충분히 반복한 후
 * 맨 앞부터 6개 원소의 값을 반환하는 로직
 */

public class Ex10_self {
    public static void main(String[] args) {
        int[] lotto = new int[45];  // 1-45 값을 배열에 할당하기 위해 이렇게 배열 선언

//      for (int i : lotto) {       // 출력할 사용하기 좋지만 i가 점점 증가하면서 값을 넣어야 하니까 이렇게 하는 게 맞음
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = i + 1;       // 빈 배열에 1-45를 차례대로 초기화
        }

        for (int i = 0; i < 100; i++) {
//            int k = (int)(Math.random() * 6) + 1;
            int k = (int)(Math.random() * lotto.length);
            int temp = lotto[0];
            lotto[0] = lotto[k];
            lotto[k] = temp;
        }

        Arrays.sort(lotto);

        System.out.print("로또 번호: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(lotto[i] + " ");
        }
    }
}

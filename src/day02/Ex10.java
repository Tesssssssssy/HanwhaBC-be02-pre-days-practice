package day02;

/**
 * Ex08 로또 문제 선생님 풀이 2
 */

import java.util.Arrays;

public class Ex10 {
    public static void main(String[] args) {

        int lotto [] = new int[45];     // 일단 45칸의 배열 확보

        for(int i = 0; i < lotto.length; i++) {             // 배열 0-44칸에 1부터 45까지 일단 값 초기화
            lotto[i] = i + 1;
        }

        for(int i = 0; i < 100; i++) {                      // 100은 임의로 정한 횟수 (어떤 수로 해도 상관 x)
            int j = (int)(Math.random()*lotto.length);      // 1-45 사이의 임의의 랜덤 값 생성 후 j에 초기화
            int std = lotto[0];                             // std에 배열 첫 번째 값 초기화
            lotto[0] = lotto[j];                            // 배열의 첫 번째 index에 임의로 생성한 j를 index로 갖는 값 할당.
            lotto[j] = std;                                 // 그리고 임의로 생성한 j를 index로 갖는 값에
                                                            // 0번 index 값을 할당한 std 값을 할당
                                                            // 즉, 값을 할당하고 무작
        }

        Arrays.sort(lotto);                                 // 배열 오름차순 정렬

        for (int i = 0; i < 6; i++) {
            System.out.println(lotto[i] + " ");             // 무작위로 값 할당하고 배열 내 값의 순서를 마구 뒤집고
        }                                                   // 배열 앞에서 6개만 출력하겠다는 의미
    }

    // 시간 복잡도는 낮지만
    // 공간 복잡도는 높은 편
    // 근데 사실 배열 6칸이나 45칸이나 큰 차이는 없음.
}

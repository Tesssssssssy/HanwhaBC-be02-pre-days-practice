package day02;

import java.util.Arrays;

/**
 * Ex08 로또 문제 선생님 풀이 3
 */

public class Ex11 {
    public static void main(String[] args) {
        // 로또번호자동 생성기
        // 1부터 45까지의 숫자 중에서 중복 없이 6개의 숫자를 랜덤하게 생성

        int lotto [] = new int[6];
        for(int i = 0; i < lotto.length; i++){
            lotto[i] = (int)(Math.random() * 6) + 1;   // 일단 랜덤 번호 생성 후 배열에 저장  // 추후 45로 변경해주면 됨
        }

        boolean flag = true;      // while문 다시 시작하기 위한 일종의 장치
                                  // true여야 while문 시작할 수 있으니까 true로 일단 초기화

        while(flag) {       // 일단 while문 시작
            flag = false;
            // while 반복문 시작하자마자 flag를 false로 바꿔준다.
            // 아래 for 반복문에서 flag를 true로 바꿔줄 예정

            for (int i = 0; i < 6; i++) {
                for (int j = i + 1; j < 6; j++) {   // j는 당연히 i 하나 다음부터 시작하면서 비교 시작
                                                    // 첫 번째 원소는 그냥 두고 다음 원소부터 겹치는 지 확인하면 되니까
                    if (lotto[i] == lotto[j]) {     // 만약 두 값이 같다면
                        lotto[i] = (int) (Math.random() * 6) + 1;      // 새로운 랜덤 수 생성 후 할당   // 추후 45로 변경해주면 됨
                        i = 0;          // 다시 처음부터
                        flag = true;    // 그러려면 flag는 true여야 한다.
                    }
                }
            }
        }

        Arrays.sort(lotto);

        for (int n : lotto) {
            System.out.println(n);
        }

        // 이 코드는 시간 복잡도가 너무 크다.
    }
}

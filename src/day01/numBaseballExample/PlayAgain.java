package day01.numBaseballExample;

import java.util.Scanner;

/**
 * 경기 재시작 여부 확인
 *
 * 마찬가지로 Scanner클래스를 통해 다시 시작하는 여부를 입력받는다.
 * 여기서는 한 글자를 받으므로 charAt()이라는 메서드를 사용해서 받은 글자를 char타입으로 변환해준다.
 * 그리고 조건문을 이용하여 게임을 다시 시작할지 boolean타입으로 반환해준다.
 *
 */
public class PlayAgain {
    public boolean playagain() {
        System.out.println("축하합니다! 게임을 다시 실행하시겠습니다? 다시 시작: 1 / 종료: 2");
        Scanner scanner = new Scanner(System.in);

        char answer = scanner.next().charAt(0);
        if (answer == 1) {
            return true;
        }
        return false;
    }
}

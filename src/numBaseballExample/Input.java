package numBaseballExample;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * 입력값 받기
 *
 * 자바의 Scanner 클래스를 이용해서 플레이어의 입력값을 받는다.
 * 여기서 주의해야 할 점은 scanner.next()로 받은 입력값은 String 타입이므로
 * split을 통해 각 숫자(타입은 String)를 3개로 분리해주고 이를 parseInt로 int타입으로 변환해 주어야 한다는 점이다.
 * 그런 다음 List <Integer> 타입으로 반환해준다.
 *
 */

public class Input {
    public List<Integer> playerNum() {
        System.out.println("\n숫자를 입력해주세요!");
        Scanner scanner = new Scanner(System.in);

        List<Integer> playerNum = new ArrayList<>();
        String input = scanner.next();

        for (String number : input.split("")) {
            playerNum.add(Integer.parseInt(number));
        }

        return playerNum;
    }
}

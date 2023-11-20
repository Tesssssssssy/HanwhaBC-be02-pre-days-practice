package numBaseball;

import com.sun.jdi.IntegerValue;

import java.util.List;

/**
 * computer 3자리와 player 3자리 숫자 비교
 *
 * howmany 메서드
 * 해당 메서드에서는 컴퓨터의 숫자와 플레이어의 숫자를 비교하여 얼마나 많은 숫자들이 동일한지(위치와는 상관없이)를 판단한다.
 * 여기서 result에 반환되는 숫자는 스트라이크와 볼의 합이 된다.
 * 예를 들면 result에 2가 반환됐다고 하면 2 스트라이크, 1 볼 1 스트라이크, 2 볼 중 하나가 나올 수 있는 것이다.
 *
 *
 * countStrike 메서드
 * 해당 메서드에서는 스트라이크수를 판단한다. 왜 볼의 수를 판단하는 메서드는 없냐고 묻는다면 위에 hommany에서 return 된 숫자가
 * 스트라이크 수 + 볼 수 이므로 스트라이크 수만 결정된다면 볼 수도 자연스럽게 결정되기 때문이다.
 * 매개변수로 컴퓨터 숫자 배열과 플레이어 숫자 배열을 받고 각각의 자리를 비교하여 자리와 숫자가 같다면 스트라이크 수를 하나씩 늘려주면서 스트라이크수를 결정한다.
 */

public class Compare {
    public int howmany(List<Integer> computer, List<Integer> player) {
        int result = 0;
        for (int i = 0; i < player.size(); i++) {
            if (computer.contains(player.get(i))) {
                result += 1;
            }
        }
        return result;
    }

    public int countStrike(List<Integer> computer, List<Integer> player) {
        int strike = 0;
        for (int i = 0; i < player.size(); i++) {
            if (computer.get(i) == player.get(i)) {
                strike += 1;
            }
        }
        return strike;
    }

}

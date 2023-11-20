package numBaseball;

import java.util.List;

/**
 * Strike, Ball 판정
 *
 * 앞서 Compare클래스에서 판단한
 *      total(위치 상관없이 몇 개의 숫자가 같은지)
 *      strike(스트라이크 수)
 *      ball(total에서 strike를 뺀 볼 수)
 *  를 각각 경우를 조건문으로 해서 String 타입으로 반환해준다.
 */
public class Judge {
    Compare compare = new Compare();

    public String judgement(List<Integer> computer, List<Integer> player) {
        int total = compare.howmany(computer, player);
        int strike = compare.countStrike(computer, player);
        int ball = total - strike;

        if (total == 0) {
            return "nothing";
        } else if (strike == 0) {
            return ball + "볼";
        } else if (ball == 0) {
            return strike + "스트라이크";
        }
        return strike + "스트라이크" + ball + "볼";
    }
}

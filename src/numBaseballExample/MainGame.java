package numBaseballExample;

import java.util.List;

/**
 * 게임 실행 부분
 *
 *  여태까지 각각의 클래스로 나누어 구현했던 부분을 객체로 불러와주고
 *  while조건문이 3 스트라이크가 나올 때까지 반복해준다.
 *  게임을 다시 시작할 여부를 확인해주기 위해 boolean타입의 again변수를 하나 만들어 준 것이 특징이다.(위의 Playagain과 연결)
 */
public class MainGame {
    public static void main(String[] args) {
        GenerateRandomNum generateRandomNum = new GenerateRandomNum();
        Input input = new Input();
        Judge judge = new Judge();
        PlayAgain playAgain = new PlayAgain();

        boolean ans = true;

        while(ans) {
            List<Integer> computer = generateRandomNum.create();
            String result = "";

            while(!result.equals("3스트라이크")) {
                result = judge.judgement(computer, input.playerNum());
                System.out.print(result);
            }
            ans = playAgain.playagain();
        }
    }
}


package day04.Game;

/**
 *  플레이어 2명이 10개 중 하나를 고른다.
 *  맞추는 사람이 2명 (야바위를 내는 사람이 2명  x)
 *
 *  3개 중 정답 1개 -> 점수 1점 증가
 *  3개 중 꽝 1개  -> 하트 1개 감소
 *  3개 중 1개 폭탄 -> 플레이어 점수 1점 줄어듦 && 해당 플레이어의 하트 1개 감소
 *
 *  클리어 조건
 *          플레이어 2명의 점수의 합이 3줨이면 clear
 *          하트가 전부 줄어들면 실패
 *
 *  만약 player1, player2의 heart 개수가 0 이상이면 계속 진행
 *
 *  클리어할 때마다 게임 리셋
 *  플레이어가 1개 뽑을 때마다 새롭게 3개 야뱌위 생성
 *
 *  플레이어 2명이 번갈아 가면서 선택
 *  플레이어 2명의 점수는 공유하는 것.
 *  플레이어 둘 중 한 명의 하트 개수가 0이 되면 더 이상 플레이 불가.
 *
 *  플레이어 2명
 *          하트(목숨) 개수   - 틀릴때마다 하트 개수가 줄어든다.
 *          하트 초기값 : 5
 *          점수 (공유해서 사용해야 함)    ->   static
 *
 *  메인클래스에서 직접 객체에 값 할당 금지
 *  모든 속성값들은 전부 private으로 설정해야 함.
 */

public class Yabawi {
    private int[] num = new int[3];
    private int answer;
    private int kkwang;
    private int bomb;
    public Yabawi() {
        for (int i = 0; i < num.length; i++) {        // i = 0, 1, 2, 3, 4, 5
            int randomNum = (int)(Math.random() * 3) + 1;

            for (int j = 0; j < i; j++) {               // j = 0, 1 ,2, 3, 4
                if (num[j] == randomNum) {
                    randomNum = (int)(Math.random() * 3) + 1;
                    j = -1;
                }
            }

            // 반복문이 끝났을 때 random한 숫자를 저장하겠다.
            num[i] = randomNum;
        }

        answer = num[0];
        kkwang = num[1];
        bomb = num[2];
    }

    public int[] getNum() {
        return num;
    }

    public int getAnswer() {
        return answer;
    }

    public int getKkwang() {
        return kkwang;
    }

    public int getBomb() {
        return bomb;
    }
}

/**
 *  야바위 클래스에서 점수 3개를 1-3까지의 random 수로 중복 없이 생성하고
 *  3개가 각각 정답, 꽝, 폭탄이어야 함.
 *
 *
 *  그러면 플레이어 1, 2가 번갈아 가면서 뽑는데
 *  -> 플레이어들을 배열로?
 *      -> 배열로 하고 다시 i를 0으로...?
 *          -> no. 비효율적이다.
 *              -> 아니야. 그냥 while문에서 player1, 2가 한 번씩 하고 반복하도록 하면 되고
 *                 static 변수인 score가 0이 되면 System.exit(0)으로 처리하면 되고
 *                 player의 heart 개수가 0이면 그 사람은 더 이상 못하는 식으로 하자.
 *
*/

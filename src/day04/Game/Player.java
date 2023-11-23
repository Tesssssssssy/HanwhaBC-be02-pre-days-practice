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


public class Player {

    private String name;

    private int input;
    private int heartCnt;
    private static int score;

    public Player(String name, int input, int heartCnt, int score) {
        this.name = name;
        this.input = input;
        this.heartCnt = heartCnt;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getInput() {
        return input;
    }

    public int getHeartCnt() {
        return heartCnt;
    }

    public void setInput(int input) {
        this.input = input;
    }

    public void setHeartCntDown() {
        this.heartCnt -= 1;
    }

    public void setHeartCntReset() {
        this.heartCnt = 5;
    }

    public static int getScore() {
        return score;
    }

    public static void setScoreUp() {
        score += 1;
        Player.score = score;
    }

    public static void setScoreReset() {
        score = 0;
        Player.score = score;
    }

    public static void setScoreDown() {
        if (score <= 0) {
            Player.score = 0;
        } else {
            Player.score -= 1;
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "이름= '" + name + '\'' +
                ", 하트개수= '" + heartCnt + '\'' +
                ", 점수= '" + score + '\'' +
                '}';
    }
}

package day04.WooTechCourseRacing;

/**
 * 초간단 자동차 경주 게임을 구현한다.
 *
 * 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
 * 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력.
 * 사용자는 몇 번의 이동을 할 것인지를 입력.
 *
 * 전진하는 조건은 0에서 9 사이에서 무작위 값을 구한 후 무작위 값이 4 이상일 경우.
 *  -> 횟수를 5번 입력했다고 하면
 *      5번 동안 random 수가 계속 생성되어야 하고
 *      그 random 수가 4 이상이면 전진하고
 *                    4 미만이면 전진 x
 *
 * 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.
 * 우승자가 여러 명일 경우 쉼표(,)를 이용하여 구분한다.
 *
 * 경주 할 자동차의 수 입력
 * 3
 *
 * 경주할 자동차 이름을 입력하세요.
 * pobi
 * woni
 * jun
 *
 * 시도할 회수는 몇회인가요?
 * 5
 *
 * 실행 결과
 * pobi : -
 * woni :
 * jun : -
 *
 * pobi : -----
 * woni : ----
 * jun : -----
 *
 * 최종 우승자 : pobi, jun
 */

public class RacingCar {
    private String name;
    private String movement;

    private int winnerCnt;

    public RacingCar(String name, String movement) {
        this.name = name;
        this.movement = movement;
    }

    public String getName() {
        return name;
    }

    public String getMovement() {
        return movement;
    }

    public int getWinnerCnt() {
        return winnerCnt;
    }

    public void setWinnerCnt() {
        winnerCnt = 0;
        for (int i = 0; i < this.movement.length(); i++)
        {
            if (this.movement.charAt(i) == '-') {
                winnerCnt++;
            }
        }
        this.winnerCnt = winnerCnt;
    }

    public void setMovement(int randomNum) {
        if (randomNum >= 4) {
            movement = movement + "-";
        }
        this.movement = movement;
    }
}


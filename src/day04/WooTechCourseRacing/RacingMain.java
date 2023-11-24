package day04.WooTechCourseRacing;

import java.util.Scanner;

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

public class RacingMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("경주할 자동차의 수 입력: ");
        int carCnt = scanner.nextInt();
        System.out.println("경주할 자동차의 수: " + carCnt + "대" + "\n");

        RacingCar[] racingCarArr = new RacingCar[carCnt];

        System.out.println("경주할 자동차의 이름을 입력하세요.");
        for (int i = 0; i < racingCarArr.length; i++) {
            racingCarArr[i] = new RacingCar(scanner.next(), "");
        }

        System.out.println();
        for (RacingCar racingCar : racingCarArr) {
            System.out.println("자동차 이름: " + racingCar.getName());
        }

        System.out.println();
        System.out.print("시도할 횟수는 몇 회인가요? ");
        int repeatCnt = scanner.nextInt();
        System.out.println("시도할 횟수: " + repeatCnt + "회" + "\n");

        for (int i = 0; i <  repeatCnt; i++) {
            System.out.println(i+1 + "차");
            for (int j = 0; j < racingCarArr.length; j++) {
                int randomNum = (int)(Math.random() * 9);
                racingCarArr[j].setMovement(randomNum);
                System.out.println(racingCarArr[j].getName() + " : " + racingCarArr[j].getMovement());
            }
            System.out.println();
        }

        for (int k = 0; k < racingCarArr.length; k++) {
            racingCarArr[k].setWinnerCnt();
            System.out.println(racingCarArr[k].getName() + " : " + racingCarArr[k].getWinnerCnt());
        }
        System.out.println();


        int max = racingCarArr[0].getWinnerCnt();
        for (int i = 0; i < racingCarArr.length; i++) {
            if (racingCarArr[i].getWinnerCnt() > max) {
                max = racingCarArr[i].getWinnerCnt();
            }
        }

        System.out.print("최종 우승자: ");
        for (int m = 0; m < racingCarArr.length; m++) {
            if (racingCarArr[m].getWinnerCnt() == max) {
                System.out.print(racingCarArr[m].getName() + " ");
            }
        }
    }
}

/*

경주할 자동차의 수 입력: 4
경주할 자동차의 수: 4대

경주할 자동차의 이름을 입력하세요.
pobi
woni
juni
lili

자동차 이름: pobi
자동차 이름: woni
자동차 이름: juni
자동차 이름: lili

시도할 횟수는 몇 회인가요? 5
시도할 횟수: 5회

1차
pobi :
woni :
juni : -
lili :

2차
pobi : -
woni :
juni : --
lili :

3차
pobi : --
woni : -
juni : --
lili :

4차
pobi : ---
woni : --
juni : --
lili : -

5차
pobi : ---
woni : ---
juni : --
lili : -

pobi : 3
woni : 3
juni : 2
lili : 1

최종 우승자: pobi woni

*/

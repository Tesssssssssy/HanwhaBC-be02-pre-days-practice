package day04.Game;

import javax.swing.*;
import java.util.Scanner;

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


public class YabawiMain {
    public static void main(String[] args) {

        Player player1 = new Player("player1", 0, 5, 0);
        Player player2 = new Player("player2", 0, 5, 0);
        Player[] players = new Player[2];
        players[0] = player1;
        players[1] = player2;

        System.out.println("*********************************Test*********************************");

        for (Player i : players) {
            System.out.println(i.toString());
        }
        System.out.println();

        Yabawi yabawi = new Yabawi();
        int[] yabawiEx = yabawi.getNum();

        System.out.print("야뱌위 숫자: ");
        for (int ya : yabawiEx) {
            System.out.print(ya + " ");
        }
        System.out.println();
        System.out.println("정답: " + yabawi.getAnswer());
        System.out.println("꽝: " + yabawi.getKkwang());
        System.out.println("폭탄: " + yabawi.getBomb() + "\n");
        System.out.println("\n*********************************Test*********************************" + "\n");

        System.out.println("*********************************Game Start*********************************");
        Scanner scanner = new Scanner(System.in);

        while (players[0].getHeartCnt() > 0 || players[1].getHeartCnt() > 0) {
            for (int i = 0; i < players.length; i++) {
                if (players[i].getHeartCnt() > 0 && players[i].getScore() < 3) {
                    System.out.print("1, 2, 3 중 숫자 한 개를 입력하세요: ");
                    int player1Input = scanner.nextInt();
                    players[i].setInput(player1Input);
                    System.out.println(players[i].getName() + " 입력값: " + players[i].getInput());

                    if (players[i].getInput() == yabawi.getAnswer()) {
                        System.out.println("정답입니다!");
                        players[i].setScoreUp();
                        System.out.println(players[i].getName() + " 하트 개수: " + players[i].getHeartCnt());
                        System.out.println("player들의 점수 " + players[i].getScore());
                    } else if (players[i].getInput() == yabawi.getKkwang()) {
                        System.out.println("꽝입니다.");
                        players[i].setHeartCntDown();
                        System.out.println(players[i].getName() + " 하트 개수: " + players[i].getHeartCnt());
                        System.out.println("player들의 점수 " + players[i].getScore());
                    } else if (players[i].getInput() == yabawi.getBomb()) {
                        System.out.println("폭탄입니다");
                        players[i].setHeartCntDown();
                        Player.setScoreDown();
                        System.out.println(players[i].getName() + " 하트 개수: " + players[i].getHeartCnt());
                        System.out.println("player들의 점수 " + players[i].getScore());
                    }
                    System.out.println(players[i].getName() + " round 종료" + "\n");
                }

                if (players[i].getScore() >= 3) {
                    System.out.println("player들의 score: " + players[i].getScore());
                    System.out.println("player들의 승리!");
                    System.out.println("게임 종료");
                    System.out.println("*********************************The End*********************************");
                    System.exit(0);
                }

                if (players[i].getHeartCnt() == 0) {
                    System.out.println(players[i].getName() + "  남은 기회 x" + "\n");
                }
            }
        }
        System.out.println("player들의 참여 기회가 모두 소진되었습니다.");
        System.out.println("게임 종료");
    }
}


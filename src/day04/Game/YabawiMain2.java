package day04.Game;

import javax.swing.*;
import java.util.Scanner;

public class YabawiMain2 {
    public static void main(String[] args) {

        Player player1 = new Player("player1", 0, 5, 0);
        Player player2 = new Player("player2", 0, 5, 0);

        int player1HeartCnt = player1.getHeartCnt();
        int player2HeartCnt = player2.getHeartCnt();

        String player1Name = player1.getName();
        String player2Name = player2.getName();

        System.out.println("*********************************Test*********************************");
        System.out.println(player1.toString());
        System.out.println(player2.toString() + "\n");

        Yabawi yabawi = new Yabawi();
        int[] yabawiEx = yabawi.getNum();

        System.out.print("야뱌위 숫자: ");
        for (int ya: yabawiEx) {
            System.out.print(ya + " ");
        }
        System.out.println();
        System.out.println("정답: " + yabawi.getAnswer());
        System.out.println("꽝: " + yabawi.getKkwang());
        System.out.println("폭탄: " + yabawi.getBomb() + "\n");
        System.out.println("\n*********************************Test*********************************" + "\n");

        System.out.println("*********************************Game Start*********************************");
        Scanner scanner = new Scanner(System.in);

        while (player1.getHeartCnt() > 0 || player2.getHeartCnt() > 0) {
            if (player1.getHeartCnt() > 0 && player1.getScore() < 3) {
                System.out.print("1, 2, 3 중 숫자 한 개를 입력하세요: ");
                int player1Input = scanner.nextInt();
                player1.setInput(player1Input);
                System.out.println("player1 입력값: " + player1.getInput());

                if (player1.getInput() == yabawi.getAnswer()) {
                    System.out.println("정답입니다!");
                    player1.setScoreUp();
                    System.out.println(player1.getName() + " 하트 개수: " + player1.getHeartCnt());
                    System.out.println("player들의 점수 " + player1.getScore());
                } else if (player1.getInput() == yabawi.getKkwang()) {
                    System.out.println("꽝입니다.");
                    player1.setHeartCntDown();
                    System.out.println(player1.getName() + " 하트 개수: " + player1.getHeartCnt());
                    System.out.println("player들의 점수 " + player1.getScore());
                } else if (player1.getInput() == yabawi.getBomb()) {
                    System.out.println("폭탄입니다");
                    player1.setHeartCntDown();
                    Player.setScoreDown();
                    System.out.println(player1.getName() + " 하트 개수: " + player1.getHeartCnt());
                    System.out.println("player들의 점수 " + player1.getScore());
                }
                System.out.println(player1.getName() + " round 종료" + "\n");
            }

            if (player2.getHeartCnt() > 0 && player2.getScore() < 3) {
                // player2
                System.out.print("1, 2, 3 중 숫자 한 개를 입력하세요: ");
                int player2Input = scanner.nextInt();
                player2.setInput(player2Input);
                System.out.println("player2 입력값: " + player2.getInput());

                if (player2.getInput() == yabawi.getAnswer()) {
                    System.out.println("정답입니다!");
                    player2.setScoreUp();
                    System.out.println(player2.getName() + " 하트 개수: " + player2.getHeartCnt());
                    System.out.println("player들의 점수 " + player2.getScore());
                } else if (player2.getInput() == yabawi.getKkwang()) {
                    System.out.println("꽝입니다.");
                    player2.setHeartCntDown();
                    System.out.println(player2.getName() + " 하트 개수: " + player2.getHeartCnt());
                    System.out.println("player들의 점수 " + player2.getScore());
                } else if (player2.getInput() == yabawi.getBomb()) {
                    System.out.println("폭탄입니다");
                    player2.setHeartCntDown();
                    Player.setScoreDown();
                    System.out.println(player2.getName() + " 하트 개수: " + player2.getHeartCnt());
                    System.out.println("player들의 점수 " + player2.getScore());
                }
                System.out.println(player2.getName() + " round 종료" + "\n");
            }

            if (player2.getScore() >= 3) {
                System.out.println("player들의 score: " + player2.getScore());
                System.out.println("게임 종료");
                System.out.println("*********************************The End*********************************");
                System.exit(0);
            }

            if (player1.getHeartCnt() == 0 && player2.getHeartCnt() == 0) {
                System.out.println(player1.getName() + ", " + player2.getName() + "남은 기회 x");
                System.out.println("게임 종료");
            }
        }
    }
}
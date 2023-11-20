package day01;

import java.util.List;

public class Ex04 {
    public static void main(String[] args) {
        // 1은 가위, 2는 바위, 3은 보

        int scissor = 1;
        int rock = 2;
        int paper = 3;

        Integer[] weapon = {scissor, rock, paper};
        // Player는 이름이 있고 가위 바위 보 중 하나를 저장할 수 있다.

        double random1 = Math.random();
        int num1 = (int)Math.round(random1 * (weapon.length-1));

        int player1 = weapon[num1];

        double random2 = Math.random();
        int num2 = (int)Math.round(random2 * (weapon.length-1));

        int player2 = weapon[num2];

        System.out.println("player1: " + player1);
        System.out.println("player2: " + player2);

        if (player1 > player2) {
            System.out.println("player1 승리");
        } else if (player1 == player2) {
            System.out.println("무승부");
        } else {
            System.out.println("player2 승리");
        }
        // player01이 가위, 바위, 보 중 랜덤하게 하나를 선택

        // player02가 가위, 바위, 보 중 랜덤하게 하나를 선택

        // 둘 중에 이긴 사람 출력, 무승부면 계속 반복


    }

}


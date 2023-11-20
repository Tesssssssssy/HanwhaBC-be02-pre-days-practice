package day01;

import java.util.List;

public class Ex04 {
    public static void main(String[] args) {
        // 1은 가위, 2는 바위, 3은 보

/*
        int scissor = 1;
        int rock = 2;
        int paper = 3;

        Integer[] weapon = {scissor, rock, paper};
        // Player는 이름이 있고 가위 바위 보 중 하나를 저장할 수 있다.

        double random1 = Math.random();
        int num1 = (int)Math.round(random1 * (weapon.length-1));

        double random2 = Math.random();
        int num2 = (int)Math.round(random2 * (weapon.length-1));
*/

        Player player1 = new Player();
        player1.name = "player1";
        player1.weapon = (int) (Math.random()*3)+1;

        Player player2 = new Player();
        player2.name = "player2";
        player2.weapon = (int) (Math.random()*3)+1;


        System.out.println(player1.name + " : " + player1.weapon);
        System.out.println(player2.name + " : " + player2.weapon);


        // player01이 가위, 바위, 보 중 랜덤하게 하나를 선택

        // player02가 가위, 바위, 보 중 랜덤하게 하나를 선택

        // 둘 중에 이긴 사람 출력, 무승부면 계속 반복


        // 무승부면 반복
        while(player1.weapon == player2.weapon) {
            System.out.println(player1.weapon);
            System.out.println(player2.weapon);
            System.out.println("무승부");
            //      player01이 가위, 바위, 보 중 랜덤하게 하나를 선택
            //      객체 생성, 이름을 player1로 저장, 랜덤으로 가위바위보 중 하나 저장
            //      player02가 가위, 바위, 보 중 랜덤하게 하나를 선택
            //      객체 생성, 이름을 player2로 저장, 랜덤으로 가위바위보 중 하나 저장
            //      둘 중에 이긴 사람 이름 출력
            player1.weapon = (int)(Math.random()*3)+1;
            player2.weapon = (int)(Math.random()*3)+1;

        }
        // 1은 가위, 2는 바위, 3은 보
        if(player1.weapon == 1 && player2.weapon ==2 || player1.weapon == 2 && player2.weapon ==3 || player1.weapon == 3 && player2.weapon ==1) {
            System.out.println("player02 승리!!");
        } else {
            System.out.println("player01 승리!!");
        }



    }
}


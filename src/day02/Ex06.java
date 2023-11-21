package day02;

// 배열에 월~일까지 초기화하고 0부터 6까지 숫자를 입력 받아
// 입력한 숫자와 같은 인덱스에 있는 요일을 출력하고 범위에 없는 숫자를 입력 시
// “잘못 입력하셨습니다“를 출력

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        // 입력받기 위한 스캐너 만들기
        Scanner sc = new Scanner(System.in);

        // 월~일을 저장할 배열 만들기
        // 배열에 월~일 저장
        String[] week = {"월","화","수","목","금","토","일"};

        // 숫자를 입력받을 변수 생성
        Integer num = 0;

        // 숫자를 입력받아 변수에 저장
        num = sc.nextInt();

        // 만약에 입력받은 숫자가 0보다 크거나 같고 6보다 작거나 같으면
        //     배열에 입력받은 숫자번째 값을 출력
        // 그렇지 않으면
        //     잘못 입력하셨습니다 를 출력
        if(num >= 0 && num <= 6) {
            System.out.println(week[num]);
        } else {
            System.out.println("잘못 입력하셨습니다");
        }
    }
}


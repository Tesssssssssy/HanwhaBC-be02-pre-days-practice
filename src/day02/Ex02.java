package day02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        // 입력받기 위한 Scanner 만들기
        Scanner sc = new Scanner(System.in);

        System.out.print("integer input: ");
        int inputNum = sc.nextInt();

        System.out.println(inputNum);

        System.out.println();

        System.out.print("string input: ");
        String inputStr = sc.nextLine();
        System.out.println(inputStr);
    }
}

package day01;

public class Ex01 {
    public static void main(String[] args) {
        Integer num1;
        num1=10;

        Integer num2;
        num2=20;

        System.out.println("변경 전 num1: " + num1);
        System.out.println("변경 전 num2: " + num2);
        System.out.println();

        // 다음에 코드를 작성하여 num1과 num2에 저장된 숫자를 서로 바꾸시오
        // 단 num1 = 20;, num2=10; 사용금지

        int temp = num1;
        num1 = num2;
        num2 = temp;


        System.out.println("변경 후 num1: " + num1);
        System.out.println("변경 후 num2: " + num2);
    }
}

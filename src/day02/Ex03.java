package day02;

public class Ex03 {
    public static void main(String[] args) {
        // 총합을 저장하기 위한 변수 만들기
        int sum = 0;

        // i가 1부터 100까지 1씩 증가하면서 반복
        // 총합에 i를 더해서 저장
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        System.out.println("1부터 100까지의 총합: " + sum);


    }
}

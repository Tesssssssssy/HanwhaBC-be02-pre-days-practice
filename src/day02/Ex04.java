package day02;

public class Ex04 {
    public static void main(String[] args) {
        // 총합을 저장하기 위한 변수 만들고 0으로 초기화
        // i가 1부터 100까지 1씩 증가하면서 반복
        // 만약 i가 홀수면
        // 총합에 i를 더해서 저장

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("1부터 100까지의 숫자 중 홀수들의 합: " + sum);
    }
}

package day04.TrumpExample;

/**
 *  <접근 제어자 실습>
 *      트럼프 카드
 *      카드 52장
 *
 *      카드 클래스
 *              숫자          1-10 / j = 11 / q = 12 / k = 13
 *              모양          하트 / 다이아 / 클로버 / 스페이드
 *              가로 길이
 *              세로 길이
 *
 *      메인 클래스
 *              카드
 */

public class Trump {
    private int num;
    private String shape;
    private static int width;
    // 어떤 객체이던지 값을 공유하도록 static 선언
    // static은 잘 알고 사용해야 하고 잘 모르겠다면 아예 사용하지 않는 것이 더 좋다.
    private static int height;

    @Override
    public String toString() {
        return "Trump{" +
                "num=" + num +
                ", shape='" + shape + '\'' +
                ", width='" + width + '\'' +
                ", height='" + height + '\'' +
                '}';
    }

    public Trump(int num, String shape, int width, int height) {
        this.num = num;
        this.shape = shape;
        this.width = width;
        this.height = height;
    }



}

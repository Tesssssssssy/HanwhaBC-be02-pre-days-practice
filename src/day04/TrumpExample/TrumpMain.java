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

public class TrumpMain {
    public static void main(String[] args) {
        Trump heart01 = new Trump(1, "heart", 50, 80);
        Trump heart02 = new Trump(2, "heart", 100, 160);

        System.out.println(heart01.toString());
        System.out.println(heart02.toString());

        /*
            Trump{num=1, shape='heart', width='100', height='160'}
            Trump{num=2, shape='heart', width='100', height='160'}

            heart01, 02의 width, height를 다르게 할당했지만 같게 출력되었다.
            width, height는 static임.
            어떤 객체이던 같은 변수를 공유해서 사용한다.
            heart02 객체가 생성되면서 heart01의 width, height 값이 덮어씌워진 것.

            java가 실행되면 RAM에서 동작한다.
            그리고 각 객체마다 다른 num, shape를 갖고 있는데
            width, height는 static으로 선언되어 있기 때문에 모든 객체들이 공유하는 속성값이 된다.
        */
    }

}

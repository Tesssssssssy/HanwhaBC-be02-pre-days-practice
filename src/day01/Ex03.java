package day01;

public class Ex03 {
    public static void main(String[] args) {
        // 1. 다음과 같이 정사각형을 출력하는 코드 작성
        /*
        ----------
         *****
         *****
         *****
         *****
         *****
        ----------
         */

        System.out.println("----------");
        for (int i = 0; i < 5; i++) {
            System.out.println("*****");
        }
        System.out.println("----------");
        System.out.println();


        // 2. 다음과 같이 삼각형을 출력하는 코드 작성
        // *를 printf로 반복 횟수만큼 반복해서 출력
        // 다음 줄로 넘어가는 코드

        /*
        ----------
         *
         **
         ***
         ****
         *****
        ----------
         */

        System.out.println("----------");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------");
        System.out.println();

        // 3. 다음과 같이 삼각형을 출력하는 코드 작성
        // 공백을 printf로 점점 줄어들게 (4, 3, 2, 1, 0) 출력
        // *를 printf로 반복 횟수만큼 반복해서 출력
        // *를 printf로 2씩 커지면서 반복 횟수만큼 반복해서 출력
        // 다음 줄로 넘어가는 코드

        /*
        ----------
             *                    첫 칸부터 빈칸 4칸
            ***                            빈칸 3칸
           *****                           빈칸 2칸
          *******                          빈칸 1칸
         *********                         빈칸 x
         ----------
         */

        System.out.println("----------");
        for (int i = 0; i < 5; i++) {               // 총 5줄
            for (int j = 5-1; j > i; j--) {
                System.out.print(" ");              // 첫 줄 빈칸 4개 -> 그 다음 줄 3개 -> 2개 -> 1개 -> 빈칸 x
            }
            for (int k = 0; k < (2*i+1); k++) {
                System.out.print("*");              // *는 첫 줄 1개 -> 3개 -> 5개 -> 7개 -> 9개
                                                    // => k가 0부터 시작이니까 (2i+1)개씩 늘어나며 출력
            }
            System.out.println();                   // 빈칸과 *을 한 줄에 모두 출력했으니까 개행하고 다음 line으로
        }
        System.out.println("----------");

    }
}

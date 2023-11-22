package day03;

public class Main {
    public static void main(String[] args) {
        Student ltw;    // Student type의 변수 선언
        ltw = new Student();

        ltw.name = "임태우";
        ltw.age = 27;
        ltw.gender = "남자";
        ltw.fullness = 60;
        ltw.intelligence = 10;

        System.out.println("메소드 실행 전");
        System.out.println(ltw.intelligence);
        System.out.println(ltw.fullness);

        Integer res1 = ltw.studying("자료구조", 3);    // 10 + 2 * 3 => intelligence = 10 -> 16
        Integer res2 = ltw.eating("bab", 20);       // 60 + 20 => fullness = 60 -> 80

        System.out.println();
        System.out.println("메소드 실행 후");
        System.out.println("ltw.intelligence: " + ltw.intelligence);
        System.out.println("ltw.fullness" + ltw.fullness);

        System.out.println("res1: " + res1);
        System.out.println("res2: " + res2);
    }

    /*
        메소드 실행 전
        10
        60

        메소드 실행 후
        16
        80
    */
}

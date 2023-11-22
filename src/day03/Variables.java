package day03;

import java.sql.SQLOutput;

public class Variables {
    /*
      객체 = 인스턴스 변수
      객체가 생성되어야 있는 변수 => 인스턴스 변수
      클래스 안에 만들어지고, 객체가 생성될 때 생서된다.
      객체가 저장된 변수가 없을 때 삭제된다. (by GC(Garbage Collector)가 삭제)
    */
    Integer num = 20;

    void method() {

        /*
         지역 변수
         메소드 안에서 만들어지고, 메소드가 실행될 때 생성된다.
         메소드가 끝날 때 변수도 같이 삭제된다.
        */

        Integer num;    // 위에 있는 변수와 이름이 같지만 다른 것. (구분이 되고 있다.)
        num = 10;

        System.out.println(num);

        System.out.println(this.num);

    }
}

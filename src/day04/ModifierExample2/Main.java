package day04.ModifierExample2;

import day04.ModifierExample1.Class1;

public class Main {
    public static void main(String[] args){
        Class1 class1 = new Class1(10);
//        class1.num1 = 20;

        /*
            'num1' is not public in 'day04.ModifierExample1.Class1'.
            Cannot be accessed from outside package
        */


        /*
            문법적으로 틀린 것도 아닌데
            왜 변수에 직접 접근해서 값을 할당하거나 수정하면 안될까?

            생성한 객체에 어떤 값을 넣을 지 알 수 없다.
            그래서 메소드를 통해 수정해야 함.

            private으로 값들을 바꾸지 못하게 막아버리고
            메소드로만 할 수 있도록.

            그러면 포켓몬에서 z 값을 private으로 막아놨으면 z값을 받아가지도 못한다.
            그래서 z값을 받아야 한다면 getter를 사용해서 z값을 받아야 한다.

            그리고 여러 제약 조건들을 부여하면서 캡슐화를 한다.

            객체의 속성값에 직접 접근하는 방식은 절대 허용하면 안된다.
            접근해서 값을 얻는 것이 가능허다면
            속성값을 임의로 변경할 수도 있다는 말이기 때문에
            접근 제어자를 통해 객체의 속성값에 직접 접근하는 것을 막야아 한다.
        */

    }
}
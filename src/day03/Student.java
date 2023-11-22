package day03;

public class Student {

    // 특징
    String name;
    Integer age;
    String gender;

    //포만감
    Integer fullness;

    // 지능
    Integer intelligence;

    // 기능
    // - 밥먹기
    Integer eating (String menu, Integer amount) {
        fullness = fullness + amount;   // 포만감은 식사 후 먹은 만큼 늘어난다.

        return fullness;    // 반환을 Integer인 fullness를 하니까 메소드의 반환클래스타입도 Integer
    }

    // - 공부하기
    Integer studying (String subject, Integer time) {
        intelligence = intelligence + 2 * time;

        return intelligence;
    }


}

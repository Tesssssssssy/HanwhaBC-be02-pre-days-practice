package day03.Inheritance;

// putlic class Inheritance extends Object {
public class Inheritance {
    public static void main(String[] args) {
        Parents parents = new Parents();

        Child child = new Child("k5");
        System.out.println(child.money);
        System.out.println(child.building);

         /*
           1000000000000
           SFC빌딩

           Child에는 객체 생성 시 k5라는 차만 설정해뒀지만
           Child extends Parents로 부모를 상속받았고
           Parents에 값을 초기화해줬기 때문에
           Child에 money, building 값을 초기화하지 않았어도
           Parents에 있는 값들을 Child가 그대로 상속받아서 출력해준다.
        */

        System.out.println(parents.money);
        System.out.println(parents.building);
        System.out.println(child.money);
        System.out.println(child.building);

        parents.shopping("63빌딩");
        System.out.println(parents.money);
        System.out.println(parents.building);
        System.out.println(child.money);
        System.out.println(child.building);

        child.shopping("63빌딩");
        System.out.println(parents.money);
        System.out.println(parents.building);
        System.out.println(child.money);
        System.out.println(child.building);


    }
}

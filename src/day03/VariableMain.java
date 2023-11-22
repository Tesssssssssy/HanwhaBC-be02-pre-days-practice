package day03;

public class VariableMain {
    public static void main(String[] args) {
        Variables var = new Variables();

        System.out.println(var.num);

        var.method();

        /*
            20  // Integer num = 20;
            10  // System.out.println(num);
            20  // System.out.println(this.num);
        */

        /*
            변수를 어디에 선언 및 저장하는지에 따라 값이 달라질 수 있다.
        */
    }

/*
    public class Variables {
        Integer num = 20;

        void method() {
            Integer num;
            num = 10;
            System.out.println(num);
            System.out.println(this.num);
        }
    }
*/


}

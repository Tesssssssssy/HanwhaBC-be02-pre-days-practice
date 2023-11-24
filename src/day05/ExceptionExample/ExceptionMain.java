package day05.ExceptionExample;

public class ExceptionMain {
    public static void main(String[] args) {
        ExceptionTest exceptionTest = new ExceptionTest();

        // exceptionTest.method01(10, 0);
        // 문법적으로는 오류가 전혀 없음.
        // 하지만 0으로 나눈다? 0으로는 나눌 수가 없다.
        // -> 실행 되다가 에러 발생
        // => 예외 처리를 해주어야 함.

        try {
            exceptionTest.method01(10, 0);
        } catch (ArithmeticException e) {
            // e.printStackTrace();
            // e.getMessage();
            System.out.println("0으로 나누지 마");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("index 크기 2 넘으면 안됨.");
        }

        // "throw"를 하는 애가 있고 이를 받아서 Exception하는 애가 있다!!
        // 꼭 기억할 것.


        /*
                java.lang.ArithmeticException: / by zero
	            at day05.ExceptionExample.ExceptionTest.method01(ExceptionTest.java:7)
	            at day05.ExceptionExample.ExceptionMain.main(ExceptionMain.java:13)
	            // by e.printStackTrace();
            0으로 나누지 마
        */


        /*
            0으로 나누지 마
        */

    }
}

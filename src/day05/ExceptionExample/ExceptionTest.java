package day05.ExceptionExample;

public class ExceptionTest {
    int method01(int num1, int num2) throws ArithmeticException, IndexOutOfBoundsException {
        int result = 0;
        int[] arr = new int[3];

        //arr[5] = 10;

        result = num1 / num2;

        return result;
    }

    // 가장 대표적인 예외가 Exception
    // 일단 여기 method에서는 throws Exception만 해놓고
    // main에서 예외 처리

    // throws Exception 해보고
    // 더 구체적인 Exception 처리를 해주면 좋다.
    // main에서 catch에서
    // e.printStackTrace();
    // e.getMessage();
    // 를 해서 더 자세히 볼 수도 있다.
}


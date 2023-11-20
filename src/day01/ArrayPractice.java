package day01;

public class ArrayPractice {
    public static void main(String[] args) {

        // ArrayList arrayList = new ArrayList();

        Integer[] arr1 = new Integer[5];    // 구식
        // 같은 타입의 값만 저장 가능 / 크기가 처음에 정해진다.

        // 배열이 저장된 변수 이름 뒤에 [순서 번호]를 써주면
        // 배열의 특정 번째의 변수에 접근
        // 순서 번호는 0번 부터 시작

        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;
        arr1[4] = 50;

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        System.out.println();

        // 실행시 에러 발생
        // Index 5 out of bounds for length 5
        // => 정해진 크기 만큼 사용해야 함.

        String[] stringArray = new String[10];
        stringArray[0] = "1st";
        stringArray[1] = "2nd";
        stringArray[2] = "3rd";
        stringArray[3] = "4th";

        for (Integer i = 0; i < 5; i++) {
            System.out.println(i);
        }

        System.out.println();

        for (Integer i = 0; i < 5; i++) {
            System.out.println(stringArray[i]);
        }

    }
}

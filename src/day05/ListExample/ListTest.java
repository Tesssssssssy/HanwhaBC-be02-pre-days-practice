package day05.ListExample;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<Integer>();
        // 특정 type만 저장될 수 있게 미리 설정

        // 배열인데 왜 리스트에 저장하지?
        // => 이 부분이 바로 다형성

        ArrayList arrayList = new ArrayList();

        // 리스트에 값 추가
        arrayList.add("111");
        arrayList.add("222");
        arrayList.add("333");

        System.out.println(arrayList);
        /*
            [111, 222, 333]
        */

        arrayList.remove("111");
        System.out.println(arrayList);
        /*
            [222, 333]
        */

        // list의 원하는 위치에 값 추가
        arrayList.add(0, 444);
        System.out.println(arrayList);
        /*
            [444, 222, 333]
        */

        // list에서 원하는 값을 찾아서 삭제
        // 여러 개가 있으면 앞에서부터 찾아서 먼저 나오는 것만 삭제
        arrayList.remove("222");
        System.out.println(arrayList);
        /*
            [444, 333]
        */

        // list에서 원하는 위치에 있는 값 삭제
        arrayList.remove(0);    // 오버로딩한 모습
        System.out.println(arrayList);
        /*
            [333]
        */

        // list에서 원하는 위치의 값 가져오기
        System.out.println(arrayList.get(0));
        /*
            333
        */

    }
}

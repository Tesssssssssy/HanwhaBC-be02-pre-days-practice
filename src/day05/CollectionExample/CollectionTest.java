package day05.CollectionExample;

import java.util.HashMap;

public class CollectionTest {
    public static void main(String[] args) {

        // HashMap<String, String> hashMap = new HashMap<String, String>();
        // 이 방식이 정석

        HashMap hashMap = new HashMap();

        // map에 값 추가
        hashMap.put("key1", "value1");
        hashMap.put("key2", "value2");
        hashMap.put("key3", "value3");

        System.out.println(hashMap);
        /*
            {key1=value1, key2=value2, key3=value3}
        */

        // map에서 원하는 우치의 값 가져오는 방법
        System.out.println(hashMap.get("key1"));
        /*
            value1
        */

        // map에서 삭제
        hashMap.remove("key1");
        System.out.println(hashMap);
        /*
            {key2=value2, key3=value3}
        */
    }
}

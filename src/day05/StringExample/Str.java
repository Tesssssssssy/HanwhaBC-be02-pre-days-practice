package day05.StringExample;

public class Str {
    public static void main(String[] args) {
        String str1 = "안녕";
        String str2 = "하세요";

        System.out.println(str1 + str2 + "\n");

        String str3 = "abc.def#ghi-";
        System.out.println("str3: " + str3);
        str3 = str3.replace(".", "!");
        System.out.println(". 처리 후 : " + str3);
        str3 = str3.replace("#", "!");
        System.out.println("# 처리 후 : " + str3);
        str3 = str3.replace("-", "!");
        System.out.println("- 처리 후 : " + str3 + "\n");

        /*
            abc.def#ghi-
            . 처리 후 : abc!def#ghi-
            # 처리 후 : abc!def!ghi-
            - 처리 후 : abc!def!ghi!
        */

        String str4 = "abc:def:ghi";
        String[] strArr = str4.split(":");
        for (String str : strArr) {
            System.out.println(str);
        }
        System.out.println();

        /*
            abc
            def
            ghi
        */

        int int1st = 1;
        int int2nd = 2;

        String str6 = "1st: %d, 2nd: %d";
        System.out.println(String.format(str6, int1st, int2nd));

        /*
            1st: 1, 2nd: 2
        */

    }
}

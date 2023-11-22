package day03;

public class Test {
    public static void main(String[] args) {
        if (args[0].equals("-a")){
            System.out.println("-a");
        } else if (args[0].equals("-al")) {
            System.out.println("-al");
        } else if (args[0].equals("-l")) {
            System.out.println("-l");
        }
    }

    /*
        cd d:/worksapce/java_workspace/hanwha_javabasic1/src/day03
        javac Test.java
        java Test.java -a

        -a 출력
    */
}

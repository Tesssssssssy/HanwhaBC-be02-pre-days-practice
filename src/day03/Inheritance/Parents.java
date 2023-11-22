package day03.Inheritance;

public class Parents {
    Long money = 1000000000000L;
    String island = "제주도";
    String land = "강님";
    String building = "SFC빌딩";

    void shopping(String item) {
       building = building + ", " + item;
    }
}

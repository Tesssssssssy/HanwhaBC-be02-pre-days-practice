package day03.Inheritance;

public class Child extends Parents {
    String car;

    public Child(String car) {
        this.car = car;
    }


    @Override
    void shopping(String item) {
        building = building + ", " + item;
        money = money * 2;
    }
}

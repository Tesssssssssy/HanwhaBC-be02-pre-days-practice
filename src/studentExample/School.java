package studentExample;

public class School {
    public static void main(String[] args) {
        Student ltw2;

        ltw2 = new Student();
        ltw2.age = 27;
        ltw2.name="임태우";


        Lecture linux = new Lecture();
        linux.lectureName = "linux 기초";
        linux.days = 2;


        Lecture db = new Lecture();
        db.lectureName = "database";
        db.days = 8;


        Lecture softwareEngineering = new Lecture();
        softwareEngineering.lectureName = "소프트웨어 공학";
        softwareEngineering.days = 3;



    }
}

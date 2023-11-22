package day03.LeagueOfLegend;

public class Main {
    public static void main(String[] args) {
        System.out.println("챔피언 객체 garen 생성 전");
        Champion garen = new Champion();
        System.out.println("챔피언 객체 garen 생성 후");
        garen.name = "가렌";
        garen.level = 1;
        garen.attackDamage = 72;
        garen.attackRange = 100;
        garen.defense = 60;
        garen.exp = 0;
        garen.hp = 580;
        garen.x = 0.0;
        garen.y = 0.0;
        garen.itemList = new String[6];
        for (int i = 0; i < garen.itemList.length; i++) {
            garen.itemList[i] = "빈칸";
        }

        /*
            위 방식으로 절대 설정하지 않음.
            alt + insert에서 생성자로 모든 속성값들 this.name = name 이런 구조로 생성자에서 설정해놓고
            Champion darius = new Champion("darius", 64, ..., new String[6]);로 객체 생성

            직접 값을 할당하는 방식은 거의 사용하지 않음.
            메소드를 통해서 값을 부여하는 방식으로 진행해야 한다.
        */

        System.out.println("챔피언 객체 darius 생성 전");
        Champion darius = new Champion();
        System.out.println("챔피언 객체 darius 생성 후");
        darius.name = "다리우스";
        darius.level = 1;
        darius.attackDamage = 64;
        darius.attackRange = 175;
        darius.defense = 39;
        darius.exp = 0;
        darius.hp = 0;
        darius.x = 0.0;
        darius.y = 0.0;
        darius.itemList = new String[6];
        for (int i = 0; i < darius.itemList.length; i++) {
            darius.itemList[i] = "빈칸";
        }

        System.out.println();

        System.out.println("원래 가렌의 기본 체력: " + garen.hp);
        // 다리우스가 가렌을 공격한다.
        darius.attackTo(garen);
        // 현재 가렌의 체력 출력
        System.out.println("1차 공격 후 현재 가렌의 체력: " + garen.hp);

        // 다리우스가 가렌을 공격한다.
        darius.attackTo(garen);
        // 현재 가렌의 체력 출력
        System.out.println("2차 공격 후 현재 가렌의 체력: " + garen.hp);

        // 다리우스가 가렌을 공격한다.
        darius.attackTo(garen);
        // 현재 가렌의 체력 출력
        System.out.println("3차 공격 후 현재 가렌의 체력: " + garen.hp);

        // 다리우스가 가렌을 공격한다.
        darius.attackTo(garen);
        // 현재 가렌의 체력 출력
        System.out.println("4차 공격 후 현재 가렌의 체력: " + garen.hp);

        // 다리우스가 가렌을 공격한다.
        darius.attackTo(garen);
        // 현재 가렌의 체력 출력
        System.out.println("5차 공격 후 현재 가렌의 체력: " + garen.hp);

        // 다리우스가 가렌을 공격한다.
        darius.attackTo(garen);
        // 현재 가렌의 체력 출력
        System.out.println("6차 공격 후 현재 가렌의 체력: " + garen.hp);

        // 다리우스가 가렌을 공격한다.
        darius.attackTo(garen);
        // 현재 가렌의 체력 출력
        System.out.println("7차 공격 후 현재 가렌의 체력: " + garen.hp);


        /*
            챔피언 객체 garen 생성 전
            생성자가 생성되었다
            챔피언 객체 garen 생성 후
            챔피언 객체 darius 생성 전
            생성자가 생성되었다
            챔피언 객체 darius 생성 후

            원래 가렌의 기본 체력: 580
            1차 공격 후 현재 가렌의 체력: 516
            2차 공격 후 현재 가렌의 체력: 452
            3차 공격 후 현재 가렌의 체력: 388
        */

        /*
         <random 수에 따른 critical 적용 이후>
            챔피언 객체 garen 생성 전
            생성자가 생성되었다
            챔피언 객체 garen 생성 후
            챔피언 객체 darius 생성 전
            생성자가 생성되었다
            챔피언 객체 darius 생성 후

            원래 가렌의 기본 체력: 580
            random 수: 87
            1차 공격 후 현재 가렌의 체력: 452
            random 수: 78
            2차 공격 후 현재 가렌의 체력: 388
            random 수: 26
            3차 공격 후 현재 가렌의 체력: 324
            random 수: 84
            4차 공격 후 현재 가렌의 체력: 196
            random 수: 87
            5차 공격 후 현재 가렌의 체력: 68
            random 수: 64
            6차 공격 후 현재 가렌의 체력: 4
            random 수: 17
            killed!
            7차 공격 후 현재 가렌의 체력: 100
        */

    }
}

package day03.PocketMon;

/**
 *  포켓몬                     포켓몬 클래스                     공중 포켓몬
 *      피카츄                           x 좌표                         z 좌표
 *      라이츄                           y 좌표                         비행한다
 *      파이리                           이름                           착륙한다
 *      꼬부기                           체력
 *      버터풀                           경험치
 *      야도란                           공격력
 *      피죤투                           타입
 *      또가스                           레벨
 *
 *                                      레벨 업한다
 *                                      경험치 얻는다
 *                                      공격한다
 *                                      공격받는다
 */

public class Main {
    public static void main(String[] args) {

        System.out.println("챔피언 객체 생성 전\n");

        PocketMon pikachu = new PocketMon(
                0,
                0,
                "pikachu",
                120,
                50,
                30,
                "nonflying",
                4
        );

        PocketMon laichu = new PocketMon(
                0,
                0,
                "laichu",
                100,
                40,
                20,
                "nonflying",
                3
        );

        PocketMon piri = new PocketMon(
                0,
                0,
                "piri",
                110,
                55,
                25,
                "nonflying",
                3
        );

        PocketMon kkobugi = new PocketMon(
                0,
                0,
                "kkobugi",
                130,
                60,
                20,
                "nonflying",
                3
        );

        PocketMon butterful = new PocketMon(
                0,
                0,
                "butterful",
                120,
                30,
                15,
                "nonflying",
                2
        );

        FlyingPocketMon yadoran = new FlyingPocketMon (
                0,
                0,
                "yadoran",
                140,
                60,
                45,
                "flying",
                5,
                5
        );

        FlyingPocketMon pijontoo = new FlyingPocketMon (
                0,
                0,
                "pijontoo",
                120,
                50,
                35,
                "flying",
                4,
                10
        );

        FlyingPocketMon ddogas = new FlyingPocketMon (
                0,
                0,
                "ddogas",
                110,
                40,
                25,
                "flying",
                3,
                11
        );

        System.out.println("\n모든 포켓몬 객체 생성 완료");
        System.out.println();

        System.out.println(pikachu.toString());
        System.out.println(laichu.toString());
        System.out.println(piri.toString());
        System.out.println(kkobugi.toString());
        System.out.println(butterful.toString());
        System.out.println(yadoran.toString());
        System.out.println(pijontoo.toString());
        System.out.println(ddogas.toString());
        System.out.println();

        System.out.println("[Round 1]");
        System.out.println(laichu.name + "의 잔여 hp: " + laichu.hp);
        pikachu.attackTo(laichu);
        System.out.println("1차 공격 후 " + laichu.name + " 의 잔여 hp: " + laichu.hp);
        System.out.println();

        System.out.println("[Round 2]");
        System.out.println(laichu.name + "의 잔여 hp: " + laichu.hp);
        piri.attackTo(laichu);
        System.out.println("1차 공격 후 " + laichu.name + "의 잔여 hp: " + laichu.hp);
        System.out.println(laichu.name + "의 레벨: " + laichu.level);
        laichu.levelUp();
        System.out.println(laichu.name + "의 레벨: " + laichu.level);
        System.out.println();

        System.out.println("[Round 3]");
        System.out.println("현재 " + yadoran.name + "의 높이(z좌표): " + yadoran.z);
        yadoran.flying(5);
        System.out.println("현재 " + yadoran.name + "의 높이(z좌표): " + yadoran.z);
        System.out.println("현재 " + pijontoo.name + "의 높이(z좌표): " + pijontoo.z);
        System.out.println(pijontoo.name + "의 잔여 hp: " + pijontoo.hp);
        yadoran.attackTo(pijontoo);
        System.out.println("1차 공격 후 " + pijontoo.name + "의 잔여 hp: " + pijontoo.hp);
        System.out.println();

        System.out.println("[Round 4]");
        System.out.println("현재 " + pijontoo.name + "의 높이(z좌표): " + pijontoo.z);
        pijontoo.descending(10);
        System.out.println("현재 " + pijontoo.name + "의 높이(z좌표): " + pijontoo.z);
        System.out.println(butterful.name + "의 잔여 hp: " + butterful.hp);
        pijontoo.attackTo(butterful);
        System.out.println("1차 공격 후 " + butterful.name + "의 잔여 hp: " + butterful.hp);
        System.out.println();

    }

    /*

    챔피언 객체 생성 전

    pikachu nonflying 포켓몬 객체 생성 완료!
    laichu nonflying 포켓몬 객체 생성 완료!
    piri nonflying 포켓몬 객체 생성 완료!
    kkobugi nonflying 포켓몬 객체 생성 완료!
    butterful nonflying 포켓몬 객체 생성 완료!
    yadoran flying 포켓몬 객체 생성 완료!
    pijontoo flying 포켓몬 객체 생성 완료!
    ddogas flying 포켓몬 객체 생성 완료!

    모든 포켓몬 객체 생성 완료

    PocketMon{이름='pikachu', 공격력=30, 체력=120, 레벨=4, 경험치=50, 타입=nonflying, x좌표=0, y좌표=0}
    PocketMon{이름='laichu', 공격력=20, 체력=100, 레벨=3, 경험치=40, 타입=nonflying, x좌표=0, y좌표=0}
    PocketMon{이름='piri', 공격력=25, 체력=110, 레벨=3, 경험치=55, 타입=nonflying, x좌표=0, y좌표=0}
    PocketMon{이름='kkobugi', 공격력=20, 체력=130, 레벨=3, 경험치=60, 타입=nonflying, x좌표=0, y좌표=0}
    PocketMon{이름='butterful', 공격력=15, 체력=120, 레벨=2, 경험치=30, 타입=nonflying, x좌표=0, y좌표=0}
    PocketMon{이름='yadoran', 공격력=45, 체력=140, 레벨=5, 경험치=60, 타입=flying, x좌표=0, y좌표=0, z좌표=5}
    PocketMon{이름='pijontoo', 공격력=35, 체력=120, 레벨=4, 경험치=50, 타입=flying, x좌표=0, y좌표=0, z좌표=10}
    PocketMon{이름='ddogas', 공격력=25, 체력=110, 레벨=3, 경험치=40, 타입=flying, x좌표=0, y좌표=0, z좌표=11}

    [Round 1]
    laichu의 잔여 hp: 100
    pikachu의 공격력: 30
    pikachu -> laichu 공격
    1차 공격 후 laichu 의 잔여 hp: 70

    [Round 2]
    laichu의 잔여 hp: 70
    piri의 공격력: 25
    piri -> laichu 공격
    1차 공격 후 laichu의 잔여 hp: 45

    [Round 3]
    현재 yadoran의 높이(z좌표): 5
    yadoran -> 5만큼 상승
    현재 yadoran의 높이(z좌표): 10
    현재 pijontoo의 높이(z좌표): 10
    pijontoo의 잔여 hp: 120
    yadoran의 공격력: 45
    yadoran -> pijontoo 공격
    1차 공격 후 pijontoo의 잔여 hp: 75

    [Round 4]
    현재 pijontoo의 높이(z좌표): 10
    pijontoo -> 10만큼 하강
    현재 pijontoo의 높이(z좌표): 0
    butterful의 잔여 hp: 120
    pijontoo의 공격력: 35
    pijontoo -> butterful 공격
    1차 공격 후 butterful의 잔여 hp: 85

    */


}

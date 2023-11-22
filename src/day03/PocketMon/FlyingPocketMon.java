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

public class FlyingPocketMon extends PocketMon {

    Integer z;

    public FlyingPocketMon(Integer x, Integer y, String name, Integer hp, Integer exp, Integer attackDamage, String type, Integer level) {
        super(x, y, name, hp, exp, attackDamage, type, level);
    }

    public FlyingPocketMon(Integer x, Integer y, String name, Integer hp, Integer exp, Integer attackDamage, String type, Integer level, Integer z) {
        super(x, y, name, hp, exp, attackDamage, type, level);
        this.z = z;
    }

    void flying(Integer higher) {
        z = z + higher;
        System.out.println(this.name + " -> " + higher + "만큼 상승");
    }

    void descending(Integer lower) {
        z = z - lower;
        System.out.println(this.name + " -> " + lower + "만큼 하강");
    }

    @Override
    public String toString() {
        return "PocketMon{" +
                "이름='" + name + '\'' +
                ", 공격력=" + attackDamage +
                ", 체력=" + hp +
                ", 레벨=" + level +
                ", 경험치=" + exp +
                ", 타입=" + type +
                ", x좌표=" + x +
                ", y좌표=" + y +
                ", z좌표=" + z +
                '}';
    }
}

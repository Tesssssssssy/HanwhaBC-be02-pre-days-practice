package day03.PocketMon;

import day03.LeagueOfLegend.Champion;

import java.util.Arrays;

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

public class PocketMon {
    Integer x;
    Integer y;
    String name;
    Integer hp;
    Integer exp;
    Integer attackDamage;
    String type;
    Integer level;

    public PocketMon(Integer x, Integer y, String name, Integer hp, Integer exp, Integer attackDamage, String type, Integer level) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.hp = hp;
        this.exp = exp;
        this.attackDamage = attackDamage;
        this.type = type;
        this.level = level;

        System.out.println(this.name + " " + this.type + " 포켓몬 객체 생성 완료!");
    }

    Integer levelUp() {
        level += 1;
        System.out.println(this.name + " level up +1 !!");
        return level;
    }

    Integer expUp() {
        exp += 10;
        return exp;
    }

    void move (Integer x, Integer y) {    // 이동
        this.x = x;
        this.y = y;
    }

    Integer attacked(Integer attackDamage) {
        this.hp = this.hp - attackDamage;
        return hp;
    }

    void attackTo(PocketMon target) {
        System.out.println(this.name + "의 공격력: " + this.attackDamage);
        System.out.println(this.name + " -> " + target.name + " 공격");
        target.attacked(this.attackDamage);
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
                '}';
    }

}

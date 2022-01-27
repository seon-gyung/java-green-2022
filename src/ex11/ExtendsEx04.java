package ex11;
/**
 * 신입이 실수하지 않는 설계를 해보자!
 * 신입이 실수하면 내 책임!!!!
 */

// abstract class 추상클래스
// 1. new 할 수 없다.
// 2. 추상 메서드를 만들 수 있다. (객체의 행위를 알 수 없을 때(공통적으로 정의할 수 없을 때))abstract를 쓰면 메서드의 몸체가 필요없음. 구체적인 행위는 자식한테 맡긴다
// 3. 일반 메서드도 만들 수 있다. (모든 구체적인 애들의 공통적인 것)
 abstract class ProtossUnit { // 종족 이름
    abstract void setHp(int hp);
    abstract int getHp();
    abstract int getAttack();
 }

 // 1. 일반 클래스는 추상 메서드를 가질 수 없다.
 class Zealot extends ProtossUnit { // 근거리 공격
    String name = "질럿";
    int hp = 100 ;
    int attack = 10;

    @Override
    void setHp(int hp) {
        this.hp = hp;
    }
    @Override
    int getHp() {
        return hp;
    }
    @Override
    int getAttack() {
        return attack;
    }
 }

 class Dragoon extends ProtossUnit { // 원거리 공격
    String name = "드라군";
    int hp = 100 ;
    int attack = 20;

    @Override
    void setHp(int hp) {
        this.hp = hp;
    }
    @Override
    int getHp() {
        return hp;
    }
    @Override
    int getAttack() {
        return attack;
    }
 }

 class DarkTempler extends ProtossUnit {
    String name = "다크템플러";
    int hp = 100 ;
    int attack = 50;

    @Override
    void setHp(int hp) {
        this.hp = hp;
    }
    @Override
    int getHp() {
        return hp;
    }
    @Override
    int getAttack() {
        return attack;
    }
 }

// 신입아 DarkTempler 하나 만들어라
// name = 다크템플러
// hp = 100
// attack = 50
// 꼭 ProtossUnit으로 추상화해라
// 테스트 => 다크템플러가 질럿을 공격

public class ExtendsEx04 {

    static void attack(ProtossUnit u1, ProtossUnit u2){
        // 알고리즘부터 짜기!
        // 1. u1이 u2를 공격 -> u2.hp = u2.hp - u1.attack -> 자식 변수에 접근 안되네 -> 오버라이드 하자
        // 접근할 변수가 변경할건지, 찾을건지 판단. 변경되는것=찾는것-찾는것. 변경하는 메서드 1개, 찾을 메서드 2개 만들기. 변경하는건 보이드 
        u2.setHp(u2.getHp() - u1.getAttack());
        // 2. u2의 hp 출력 -> sysout(u2.hp)
        System.err.println(u2.getHp());
    }
    public static void main(String[] args) {
        ProtossUnit z1 = new Zealot();
        ProtossUnit d1 = new Dragoon();
        ProtossUnit dk1 = new DarkTempler();
        attack(dk1, z1);
    }
}

package ex00;

// 오버로딩 = over-loading = 과적재

/**
 * 1. 메서드는 동일한 이름으론 만들 수 없다.
 * 2. 단 매개변수의 타입이 다르거나, 위치가 더럽거나, 개수가 다르면 다른 메서드를 인식한다.
 * 3. 개발자 입장에서 함수 이름은 하나만 기억하면 된다.
 * 4. 경우의 수가 너무 많아지면 = 너무 많은 메서드를 필요로 한다. (퇴사각)
 * 5. 갯수가 적을 때 사용하면 좋다. 10개~20개 정도
 */

class 사자1 {
    String name = "사자";
    int hp = 100;
    int attack = 10;
}

class 호랑이1 {
    String name = "호랑이";
    int hp = 100;
    int attack = 15;
}

class 곰1 {
    String name = "곰";
    int hp = 100;
    int attack = 50;
}

public class MethEx05 {

    // 사자 -> 호랑이 공격
    static void attack(사자1 unit1, 호랑이1 unit2) {
        System.out.println(unit2.name + "가 공격당하고 있습니다.");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 hp : " + unit2.hp);
    }

    // 호랑이 -> 사자 공격
    static void attack(호랑이1 unit1, 사자1 unit2) {
        System.out.println(unit2.name + "가 공격당하고 있습니다.");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 hp : " + unit2.hp);
    }

    // 호랑이 -> 곰
    static void attack(호랑이1 unit1, 곰1 unit2) {
        System.out.println(unit2.name + "가 공격당하고 있습니다.");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 hp : " + unit2.hp);
    }

    // 사자 -> 곰
    static void attack(사자1 unit1, 곰1 unit2) {
        System.out.println(unit2.name + "가 공격당하고 있습니다.");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 hp : " + unit2.hp);
    }

    // 곰 -> 호랑이
    static void attack(곰1 unit1, 호랑이1 unit2) {
        System.out.println(unit2.name + "가 공격당하고 있습니다.");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 hp : " + unit2.hp);
    }

    // 곰 -> 사자
    static void attack(곰1 unit1, 사자1 unit2) {
        System.out.println(unit2.name + "가 공격당하고 있습니다.");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 hp : " + unit2.hp);
    }

    public static void main(String[] args) {
        사자1 lion1 = new 사자1();
        호랑이1 tiger1 = new 호랑이1();
        곰1 bear1 = new 곰1();

        // 호랑이 -> 사자 공격
        attack(tiger1, lion1);
        // 호랑이 -> 곰
        attack(tiger1, bear1);
        // 사자 -> 곰
        attack(lion1, bear1);
        // 사자 -> 호랑이
        attack(lion1, tiger1);
        // 곰 -> 호랑이
        attack(bear1, tiger1);
        // 곰 -> 사자
        attack(bear1, lion1);

        System.out.println(1);
        System.out.println(1.0);
        System.out.println(true);
    }
}
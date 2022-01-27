package ex07;

class 동물 {
    String name;
    int hp;
    int attack;

    String animal() {
        return name;
    }

    int life() {
        return hp;
    }

    int hit() {
        return attack;
    }

    int changeHp(int attack) {
        hp = hp - attack;
        return hp;
    }

    int apple(){
        hp = hp + 5;
        return hp;
    }
}

class 사자 extends 동물 {
    String name = "사자";
    int hp = 100;
    int attack = 10;

    String animal() {
        return name;
    }

    int life() {
        return hp;
    }

    int hit() {
        return attack;
    }

    int changeHp(int attack) {
        hp = hp - attack;
        return hp;
    }

    int apple(){
        hp = hp + 5;
        return hp;
    }
}

class 호랑이 extends 동물 {
    String name = "호랑이";
    int hp = 100;
    int attack = 15;

    String animal() {
        return name;
    }

    int life() {
        return hp;
    }

    int hit() {
        return attack;
    }

    int changeHp(int attack) {
        hp = hp - attack;
        return hp;
    }

    int apple(){
        hp = hp + 5;
        return hp;
    }
}

class 곰 extends 동물 {
    String name = "곰";
    int hp = 100;
    int attack = 50;

    String animal() {
        return name;
    }

    int life() {
        return hp;
    }

    int hit() {
        return attack;
    }

    int changeHp(int attack) {
        hp = hp - attack;
        return hp;
    }

    int apple(){
        hp = hp + 5;
        return hp;
    }
}

public class Aaaa {

    // 오버라이딩 = 무효화하다 -> 아래로 타고 내려가는 기법
    // 사자 -> 호랑이 공격
    static void attack(동물 unit1, 동물 unit2) {

        System.out.println(unit2.animal() + "가(이) 공격당하고 있습니다.");
        System.out.println(unit2.animal() + "의 hp : " + unit2.changeHp(unit1.hit()));
        System.out.println();
        System.out.println(unit2.animal() + "가(이) 사과를 먹었습니다.");
        System.out.println(unit2.animal() + "의 hp : " + unit2.apple());
        System.out.println();
        System.out.println(unit2.animal() + "가(이) 사과를 먹었습니다.");
        System.out.println(unit2.animal() + "의 hp : " + unit2.apple());
        System.out.println("===========================================");
        
    }

    public static void main(String[] args) {
        동물 lion = new 사자();
        동물 tiger = new 호랑이();
        동물 bear = new 곰();

        attack(lion, tiger);
        attack(lion, bear);
        attack(bear, tiger);
        attack(tiger, bear);

    }
}
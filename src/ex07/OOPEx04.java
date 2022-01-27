package ex07;

// 1. 모든 코드는 class 내부에 존재한다.
// 2. 자바는 class만 1급이다.
// 3. class = 설계도
// 4. class는 상태(변수)와 행위(메서드)를 가진다.
// 5. static은 찾을 때 class명.변수명
// 6. static이 아닌 애들을 메모리에 띄우는 법! 타입명 주소명(힙에 할당되엉어 있는 데이터의 주소) = new 클래스명() > heap에 뜬다.

class Dog {
    int 배고픔 = 100; // 0~100

    void 밥먹기 (){ // 메서드 = 행위
        배고픔 =  0;
    }
}

public class OOPEx04 {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d.배고픔); 
        d. 밥먹기(); // 행위
        System.out.println(d.배고픔); 
    }
}

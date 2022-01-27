package ex00;

/**
 * 메서드 규칙
 * 1. 투입구와 출구가 있다. 단, 출구(retrun)는 항상 필요하지는 않다.
 * 2. 메서드는 하나의 모듈(특정한 역할을 수행하는 코드 꾸러미)이 될 수 있다.
 * 3. 출구가 없을 때 void를 사용, 출구가 있을 때는 타입을 동일하게 해준다.
 * 4. 메서드 내부(queue)를 몰라도 사용할 수 있다. (캡슐화)
 * 5. 메서드는 1급 객체가 아니다. 자바에서는 1급 객체가 class밖에 없다.
 * 6. 모듈 (특정한 역할을 수행하는 코드 꾸러미)을 만들기 위해 메서드를 만든다.
 *  - 캡슐화, 재사용 가능, 코드 관리 편함, 메모리 관리 잘됨.
 * 
 * 7. 스테이틱 메서드 내부에서는 힙 영역 데이터 (상태)를 찾을 수 없다.
 */

public class MethEx03 {

    int sum = 0;
    
    void start(){
        int n1 = 10;
        int n2 = 20;
        int result = n1+n2;
        sum = result;
    }

    public static void main(String[] args) {
        MethEx03 m = new MethEx03();
        System.out.println("start 실행전 sum :" + m.sum);
        m.start(); // 같은 클래스에 있을 경우 클래스명 생략 가능
        System.out.println("start 실행후 sum :" + m.sum);

    }
}

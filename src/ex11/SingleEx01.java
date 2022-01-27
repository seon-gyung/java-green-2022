package ex11;

// 패턴 : 디자인 패턴 -> 설계도를 패턴으로 만들까? 

// 싱글톤 패턴 (하나의 객체를 공유할 수 있는 설계도)
class 튜브 {
    // new를 통해 튜브를 heap에 할당
    // private를 부여하여 접근에 강제성을 줌. 변수 호출 불가능
    // static을 부여하여 main이 시작되기 전에 띄워주기
    private static 튜브 instance = new 튜브();

    // 생성자에 private을 부여하여 접근에 강제성을 줌. main에서 new 불가능
    튜브 (){

    }

    // 속성(상태)에 접근할 수 있는 통로
    public static 튜브 getInstance() {
        System.out.println("만들어진 튜브를 가져옵니다.");
        return instance;
    }
}

public class SingleEx01 {
    public static void main(String[] args) {
        튜브 t1 = 튜브.getInstance();
        튜브 t2 = 튜브.getInstance();
        
        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
    }
}

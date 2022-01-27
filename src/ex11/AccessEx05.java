package ex11;

// 파일 하나당 클래스 하나가 좋다
// 하나의 자바 파일에 두개의 public class가 있을 수 없다. (import 때문에)
// 클래스 내부의 클래스는 가능하다
class 엘리스 {
    // 상태는 무조건 private
    private int 목마름; // 0~100

    엘리스(int 목마름){
        this.목마름 = 목마름;
    }

    // private에 접근할 수 있는 통로와 메서드는 public으로 작성
    // 통로 메서드
    public void 물마시기(){
        목마름 = 목마름 - 20;
    }

    public int 갈증확인하기(){
        return 목마름;
    }
}
public class AccessEx05 {
    public static void main(String[] args) {
        엘리스 e1 = new 엘리스(100);
        // 자바는 기본자료형과 문자를 더하면 결합이 되고 문자열 타입으로 변환된다.
        System.out.println("엘리스의 갈증지수 : " + e1.갈증확인하기());
        e1.물마시기();
        System.out.println("엘리스의 갈증지수 : " + e1.갈증확인하기());

        //신입
        e1.물마시기();
        e1.물마시기();
        System.out.println("엘리스의 갈증지수 : " + e1.갈증확인하기() );
    }
}
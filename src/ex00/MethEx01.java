package ex00;

// 계산기 클래스
// 상태와 행위는 꼭 필요한 것은 아니다. 상태만 있어도 되고 행위만 있어도 되고,,,
class Calculator  {
    // 각 메서드마다 새로운 스택이 열리기 때문에 변수 이름이 똑같아도 오류나지 않음
    // add 뒤에 있는 ()는 입구. 콤마로 구분한다
    // void는 출구가 없다. 
    void add(int n1, int n2){
        System.out.println("더하기 메서드입니다.");
        System.out.println(n1+n2);
    }

    // minus (빼기)
    void minus(int n1, int n2){
        System.out.println("빼기 메서드입니다.");
        System.out.println(n1-n2);
    }

    // multi (곱하기)
    void multi(int n1, int n2){
        System.out.println("곱하기 메서드입니다.");
        System.out.println(n1*n2);
    }

    // divide (나누기)
    void divide(int n1, int n2){
        System.out.println("나누기 메서드입니다");
        System.out.println(n1/n2);
    }
}

public class MethEx01 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.add(10,5);
        c1.minus(10,5);
        c1.multi(10,5);
        c1.divide(10,5);
    }
}
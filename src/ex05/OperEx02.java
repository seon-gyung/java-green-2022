package ex05;

public class OperEx02 {
    public static void main(String[] args) {
        System.out.println(!(1 == 1));  // 괄호는 우선순위를 지정할 수 있다. 느낌표는 값을 부정함!
        System.out.println(!true); // true를 부정하여 false 출력
        System.out.println(1 != 1); // != 같지 않다 라는 뜻이므로 false 출력
        System.out.println(1 < 2); // 1은 2보다 작은게 맞기 때문에 true 출력
        System.out.println(1 > 2); // 1이 2보다 큰게 아니기 때문에 false 출력
    }
}

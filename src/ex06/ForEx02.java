package ex06;

public class ForEx02 {
    // 2의 24승을 출력하시오.
    public static void main(String[] args) {
        int n = 1;
        for(int i = 1; i < 25; i = i + 1){
            System.out.println(i);

            // 연산만

            n = n * 2;

            // 조건을 걸어서 출력 or
        }
        //  여기서 출력
        System.out.println(n);
    }
}

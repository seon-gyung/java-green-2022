package ex06;

public class ConEx01 {
    public static void main(String[] args) {
        int point = 89; // 성적
        

        // 자바에서 () 다음 {} 나오는 형태일 때 {}는 전부 행위의 영역임
        if (point >= 90){
            System.out.println("A학점입니다");
        } else { // if가 아니면!!
            System.out.println("A학점이 아닙니다");
        }
    }
}

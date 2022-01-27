package ex07;

class person {
    String name;
    int height;
    int weight;

    // 클래스 설계도에 생성자를 내가 직접 만들지 않으면 디폴트 생성자가 만들어져있다.
    // 디폴트 생성자 : 클래스명(){}    
    // 디폴트 생성자 = 객체 초기화를 위해 필요!!! 객체의 초기 셋팅을 위해 필요
    person(){
       System.out.println("사람이 생성되었습니다");
       name = "홍길동";
       height = 170;
        weight = 70;
    }
}

// 생성자
public class OOPEx07 {
    public static void main(String[] args) {
        person s1 = new person();
        System.out.println(s1.name);
    }
}

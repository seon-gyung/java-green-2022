package srp;

// 종업원 - 요리사 (의존적)
public class 종업원 {

    public 음식 주문받기 (요리사 chef){
        음식 food = chef.요리하기();
        return food; // null 아무것도 없음. 뭘 리턴해야할지 모를때
    }
}

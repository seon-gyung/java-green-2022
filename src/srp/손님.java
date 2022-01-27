package srp;


// 손님 - 종업원 관계 (의존성)
public class 손님 {

    public void 먹기(종업원 manager, 요리사 chef){
        음식 food = manager.주문받기(chef);
        System.out.println(food.getName() + "을 먹습니다.");
    }
}

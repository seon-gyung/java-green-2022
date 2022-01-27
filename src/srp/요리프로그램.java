package srp;

public class 요리프로그램 {
    public static void main(String[] args) {
        손님 customer = new 손님();
        종업원 manager = new 종업원();
        요리사 chef = new 요리사();
        // 손님, 종업원, 요리사를 만들 책임 = 나
        
        customer.먹기(manager,chef);
    }
}

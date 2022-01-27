package woowacoffeetest;

import java.util.List;

public class CoffeeShop {
    public static void main(String[] args) {
        // 객체를 만들 책임 = 나
        // 띄워야 할 객체 손님, 바리스타, 메뉴판
        Customer 손님 = new Customer();
        Barista 바리스타 = new Barista();
        // Menu 메뉴판 = new Menu(List);

        MenuItem d1 = new MenuItem("아메리카노", 1500);
        MenuItem d2 = new MenuItem("돌체라떼", 3500);
        MenuItem d3 = new MenuItem("토피넛라떼", 4500);

    }
}

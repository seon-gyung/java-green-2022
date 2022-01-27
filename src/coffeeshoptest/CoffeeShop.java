package coffeeshoptest;

import java.util.Arrays;
import java.util.List;

public class CoffeeShop {
    public static void main(String[] args) {
        // 객체를 만들 책임 = 나
        Customer 손님 = new Customer();
        Barista 바리스타 = new Barista();
        MenuItem d1 = new MenuItem("아메리카노", 1500);
        MenuItem d2 = new MenuItem("돌체라떼", 3500);
        MenuItem d3 = new MenuItem("토피넛라떼", 4500);

        List<MenuItem> list = Arrays.asList(d1, d2, d3);

        Menu menu = new Menu(list);

        손님.order("아메리카노", menu, 바리스타);  




    }
}

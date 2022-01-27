package coffeeshoptest;

import lombok.Data;

interface Icustomer {
    abstract void order (String menuName, Menu menu, Barista barista);
}

@Data
public class Customer implements Icustomer {

    private String name;

    Customer(){
        this.name = "홍길동";
    }

    public void order (String menuName, Menu menu, Barista barista){
        MenuItem menuItem = menu.choose(menuName);
        Coffee coffee = barista.makeCoffee (menuItem);
        System.out.println(name + "이(가) " + barista + "에게 " + menuItem.getPrice() + "원 " +
        menuItem.getName() + "를(을) 받았습니다.");


    }
}

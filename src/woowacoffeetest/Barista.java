package woowacoffeetest;

public class Barista {
    public Coffee makeCoffee(MenuItem menuItem){
        Coffee coffee = new Coffee(menuItem);
        return coffee;
    }
}

package woowacoffeetest;

import java.util.List;

public class Menu {

    private List<MenuItem> items;

    public Menu(List<MenuItem> items){
        this.items = items;
    }

    public MenuItem choose (String name){
        for(MenuItem drink : items){
            if(drink.getName().equals(name)){
                return drink;
            }
        }
        return null;
    }
}

package coffeeshoptest;

import java.util.List;

public class Menu {

    private List<MenuItem> items;

    public Menu(List<MenuItem> items){
        this.items = items;
    }

    public MenuItem choose (String menuName){
        for(MenuItem drink : items){
            if(drink.getName().equals(menuName)){
                return drink;
            }
        }
        return null;
    }
}

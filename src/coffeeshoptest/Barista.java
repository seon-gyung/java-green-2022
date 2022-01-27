package coffeeshoptest;

import java.util.List;
import java.util.jar.Attributes.Name;

import lombok.Data;

interface IBarista {
    abstract Coffee makeCoffee(MenuItem menuItem);
}

@Data
public class Barista implements IBarista {

    private String name;

    Barista(){
        this.name = "공유";
    }

    @Override
    public Coffee makeCoffee(MenuItem menuItem) {
        Coffee coffee = new Coffee(menuItem);
        return coffee;
    }
}

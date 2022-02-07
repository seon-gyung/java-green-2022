package ex22;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("우유");
        list.add("빵");
        list.add("버터");
        
        list.add(1, "사과");
        list.set(2, "포도");
        list.remove(3);

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}

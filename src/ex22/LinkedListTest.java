package ex22;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("우유");
        list.add("빵");
        list.add("버터");
        
        // list.add(1, "사과");
        // list.set(2, "포도");
        list.remove(1);

        // for (int i = 0; i < list.size(); i++){
        //     System.out.println(list.get(i));
        // }
        
        System.out.println(list.get(1));

    }
}

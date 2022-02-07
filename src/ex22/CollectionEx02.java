package ex22;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionEx02 {
    public static void main(String[] args) {
        Set<Integer> datas = new HashSet<Integer>();
        datas.add(10);
        datas.add(20);
        datas.add(20); // 중복되는 데이터는 들어갈 수 없음
        datas.add(30);
        datas.add(40);

        datas.remove(10); // index가 아니라 지울 data를 적어야 함

        // datas에 담긴 데이터의 개수
        System.out.println(datas.size());
        // datas에 담긴 데이터 전체
        System.out.println(datas);
        // datas에 담긴 데이터 하나씩 출력
        Iterator<Integer> its = datas.iterator();
        while(its.hasNext()){
            System.out.println(its.next());
        }
    }
}

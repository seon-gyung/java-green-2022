package ex07;

class doctor {
    String name = "홍길동";
    int sal = 5000;
}

public class OOPEx02 { 
    public static void main(String[] args) {
        doctor n = new doctor();
        System.out.println(n.name);
        System.out.println(n.sal);
    }
}

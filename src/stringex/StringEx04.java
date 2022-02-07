package stringex;

import java.util.Scanner;

class User {
    private String name;
    private String tel;
    private char gender;
    private int age;

    public User(String name, String tel, char gender, int age) {
        this.name = name;
        this.tel = tel;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

public class StringEx04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // A01-이름:홍길동-전화번호:0102222-성별:남-나이: 20
        // String data = sc.nextLine();
        String data = "A01-이름:홍길동-전화번호:0102222-성별:남-나이: 20";

        String[] tokens = data.split("-");
        // System.out.println(tokens[0]);
        // System.out.println(tokens[1]);
        // System.out.println(tokens[2]);
        // System.out.println(tokens[3]);
        // System.out.println(tokens[4]);

        // equals() 문자열의 값을 비교하는 메서드
        if (tokens[0].equals("A01")) {
            // 1. 이름:홍길동 을 :으로 구분해서 홍길동을 찾자
            String name = tokens[1].split(":")[1];

            // 2. 전화번호:0102222 을 :으로 구분해서 0102222을 찾자
            // 0으로 시작하는 숫자는 String으로 받기. int로 받으면 0이 사라진다.
            String tel = tokens[2].split(":")[1];

            // 3. 성별:남 을 :으로 구분해서 남을 찾자
            // 고정 길이 데이터는 char, 가변 길이 데이터는 String
            String genderTemp = tokens[3].split(":")[1];

            // 4. 나이: 20 을 :으로 구분해서 20을 찾자
            String ageTemp = tokens[4].split(":")[1];

            // 5. char로 담고, int로 담고 하는 형변환하기
            char gender = genderTemp.charAt(0);
            int age = Integer.parseInt(ageTemp.trim());

            // 6. 클래스로 옮겨담기 (순서 중요)
            User user = new User(
                    name,
                    tel,
                    gender,
                    age);

            System.out.println("end if");
        } else {
            System.out.println("프로그램 종료");
        }
    }
}
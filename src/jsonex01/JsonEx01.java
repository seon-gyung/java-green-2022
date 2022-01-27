package jsonex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
{
    "name": "홍길동",
    "age": 25,
    "hobby": ["농구", "도술"],
    "family": {"id": 2, "father": "홍판서", "mother": "춘섬"}
 }
 */

 class family {
    private int id;
    private String father;
    private String mother;
    
    public family(int id, String father, String mother) {
        this.id = id;
        this.father = father;
        this.mother = mother;
        
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFather() {
        return father;
    }
    public void setFather(String father) {
        this.father = father;
    }
    public String getMother() {
        return mother;
    }
    public void setMother(String mother) {
        this.mother = mother;
    }
    @Override
    public String toString() {
        return "family [father=" + father + ", id=" + id + ", mother=" + mother + "]";
    }

    public String toJson(){
        return "{\"id\":" + id + ", \"father\":"+ father + ", \"mother\":"+ mother + "}";
    }

    

 }

 class User {
     private String name;
     private int age;
     private List<String> hobby;
     private family family;
     
    public User(String name, int age, List<String> hobby, jsonex01.family family) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    public family getFamily() {
        return family;
    }

    public void setFamily(family family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "User [age=" + age + ", family=" + family + ", hobby=" + hobby + ", name=" + name + "]";
    }

    public String toJson() {
        return "{\"age\": " + age + ", \"family\": " + family.toJson() + ", \"hobby\": " + hobby + ", \" name\": "
                + name + "}";
    }
 }
 
public class JsonEx01 {
    
    public static void main(String[] args) {
        List<String> hobby = Arrays.asList("농구","도술");
        family family = new family(2, "홍판서", "춘섬");
        User user = new User("홍길동", 25, hobby, family);
        // System.out.println(user.toString());

        // 1. json 변경 (개념 : json은 생긴게 json처럼 생긴거지 타입은 문자열이다.)
        System.out.println(family.toJson());

        // toJson()으로 json화 시켜서 통신 전송이 목적

        // 2. json 데이터 통신 전송!

        // 3. json 데이터 받아서 자바 오브젝트 변경


    }
}

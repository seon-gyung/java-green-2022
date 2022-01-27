package ex06;

import java.util.Scanner;

public class GugudanTest {
    public static void main(String[] args) {
        System.out.println("출력할 구구단 범위 입력");
        
        int n1 = 0;
        int n2 = 0; 

        Scanner sc = new Scanner(System.in);

        n1 = sc.nextInt();
        n2 = sc.nextInt();

        for(int step = n1; step <= n2; step++){
            for(int n = 1; n <=9; n++){
                System.out.println(step + "*" + n + "="+ (step * n));
            }
        }
    }
}

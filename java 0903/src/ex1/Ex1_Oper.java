package ex1;

import java.util.Scanner;

/**
 * @author KOSTA
 * Document : Ex1_Oper Created on : 2014. 9. 3, 오전 10:15:28
 */
public class Ex1_Oper {
    //비교 연산자- 변수나 상수 값을 비교 할 때 쓰이는 연산자. 
    //결과는 항상 boolean (true/false)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("수1 ");
        int a = Integer.parseInt(sc. nextLine());
        System.out.print("수2 ");
        int b = Integer.parseInt(sc. nextLine());
        boolean c = a < b;// 변수 a가 변수 b보다 작다
        System.out.println("a <b:"+c);
        c = a > b;
        System.out.println("a > b :"+c);
        c = a <= b;
        System.out.println("a <= b :"+c);
        c = a >= b;
        System.out.println("a >= b :"+c);
        c = a == b;
        System.out.println("a == b :"+c);
       
        c = a !=b;
        System.out.println("a !=b : "+c);
        
       // 연산 조건
        // && : 선 조건이 ture 일 대만 후 조건을 실행
        // 선조건이 false이면 후 조건은 실행하지 않는다.
        // || : 선조건이 ture이면 후 조건을 실행하지 않으며
        // 선 조건이 false일 때만 후 조건을 실행한다.
    }

}

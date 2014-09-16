package exam;

import java.util.Scanner;

/**
 * @author KOSTA
 * Document : Exam2 Created on : 2014. 9. 3, 오후 2:39:33
 */
public class Exam2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("수를 입력하세요.");
        int a = Integer.parseInt(sc.nextLine());
        System.out.print("범위를 입력하세요.");
        int b = Integer.parseInt(sc.nextLine());
        System.out.println("[Rusult]");
        for(int i=0; i<=a; i++){
            if(i % b == 0 && i !=0){
            System.out.println();
        }
            System.out.print(i+"\t");
        
        
    }

    }
}
// for, if, else
// 연습문제
// 수를 입력하세요. 9
// 범위를 입력하세요. 3
//[Result]
// 0 1 2
// 3 4 5
// 6 7 8
// 수를 입력하세요. 9
// 범위를 입력하세요. 5
// [Result]
// 0 1 2 3 4 
// 5 6 7 8 9
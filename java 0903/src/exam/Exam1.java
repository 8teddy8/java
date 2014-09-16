package exam;

import java.util.Scanner;

/**
 * @author KOSTA Document : Exam1 Created on : 2014. 9. 3, 오전 11:35:43
 */
public class Exam1 {

    // Scanner로 부터 수를 입력 받은 후
    // 그 수가 홀수인지 짝수인지를 출력하세요.
    // ex) 수 입력: 1<enter>
    // 입력한 수 [1]은 홀수 입니다.
    // [도구] : Scanner, if else, 연산
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("수 입력: ");
        int a = Integer.parseInt(sc.nextLine());
        // 홀수인지 짝수인지를 구별하기 위한 제어문과 출력문을 저장 할 
        // 변수를 선언
        String msg;
        if (a % 2 == 0) {
            msg = "짝수";
        } else {
            msg = "홀수"        ;
        }
        System.out.println("입력한 수 ["+a+"]은 "+msg+" 입니다.");
        
    }

}

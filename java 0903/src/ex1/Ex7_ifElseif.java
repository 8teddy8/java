package ex1;

import java.util.Scanner;

/**
 * @author KOSTA Document : Ex7_ifElseif Created on : 2014. 9. 3, 오후 1:52:14
 */
public class Ex7_ifElseif {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("좋아하는 색상 입력 (red, blue, green....");
        String msg = sc.nextLine();
        //red  
        // equalsIgnoreCase()를 해주면 대 소문자 상관없이 적어도 에러가 나지 않는다.
        if (msg.equalsIgnoreCase("red")) {
            System.out.println("빨간색 이군요.");
        } else if (msg.equalsIgnoreCase("blue")) {
            System.out.println("파랑색 이군요");            
        } else if (msg.equalsIgnoreCase("green")) {
            System.out.println("초록색 이군요.");   
        }
    }
    
}

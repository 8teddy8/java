package Exam;

import java.util.Scanner;

/**
 * @author KOSTA Document : Exam1 Created on : 2014. 9. 4, 오후 1:48:29
 */
public class Exam1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {            
            int cnum = (int)(Math.random()*2)+1;
            System.out.print("수 입력 :");
            int num = Integer.parseInt(sc.nextLine());
            if (num == 1) {
                System.out.println("1에 해당되는 일!");
            } else if (num == 2) {
                System.out.println("2에 해당되는 일!");
            } else if (num == 3) {
                System.out.println("3은 종료!");
                break;
            } else {
                System.out.println("잘못 된 수!");   
            }
        }
        
           
        }
    }



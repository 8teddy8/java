package Exam;

import java.util.Scanner;

/**
 * @author KOSTA Document : Exam1 Created on : 2014. 9. 4, ���� 1:48:29
 */
public class Exam1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {            
            int cnum = (int)(Math.random()*2)+1;
            System.out.print("�� �Է� :");
            int num = Integer.parseInt(sc.nextLine());
            if (num == 1) {
                System.out.println("1�� �ش�Ǵ� ��!");
            } else if (num == 2) {
                System.out.println("2�� �ش�Ǵ� ��!");
            } else if (num == 3) {
                System.out.println("3�� ����!");
                break;
            } else {
                System.out.println("�߸� �� ��!");   
            }
        }
        
           
        }
    }



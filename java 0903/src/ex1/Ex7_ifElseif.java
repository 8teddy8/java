package ex1;

import java.util.Scanner;

/**
 * @author KOSTA Document : Ex7_ifElseif Created on : 2014. 9. 3, ���� 1:52:14
 */
public class Ex7_ifElseif {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("�����ϴ� ���� �Է� (red, blue, green....");
        String msg = sc.nextLine();
        //red  
        // equalsIgnoreCase()�� ���ָ� �� �ҹ��� ������� ��� ������ ���� �ʴ´�.
        if (msg.equalsIgnoreCase("red")) {
            System.out.println("������ �̱���.");
        } else if (msg.equalsIgnoreCase("blue")) {
            System.out.println("�Ķ��� �̱���");            
        } else if (msg.equalsIgnoreCase("green")) {
            System.out.println("�ʷϻ� �̱���.");   
        }
    }
    
}

package exam;

import java.util.Scanner;

/**
 * @author KOSTA Document : Exam1 Created on : 2014. 9. 3, ���� 11:35:43
 */
public class Exam1 {

    // Scanner�� ���� ���� �Է� ���� ��
    // �� ���� Ȧ������ ¦�������� ����ϼ���.
    // ex) �� �Է�: 1<enter>
    // �Է��� �� [1]�� Ȧ�� �Դϴ�.
    // [����] : Scanner, if else, ����
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("�� �Է�: ");
        int a = Integer.parseInt(sc.nextLine());
        // Ȧ������ ¦�������� �����ϱ� ���� ����� ��¹��� ���� �� 
        // ������ ����
        String msg;
        if (a % 2 == 0) {
            msg = "¦��";
        } else {
            msg = "Ȧ��"        ;
        }
        System.out.println("�Է��� �� ["+a+"]�� "+msg+" �Դϴ�.");
        
    }

}

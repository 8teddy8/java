package ex1;

import java.util.Scanner;

/**
 * @author KOSTA
 * Document : Ex1_Oper Created on : 2014. 9. 3, ���� 10:15:28
 */
public class Ex1_Oper {
    //�� ������- ������ ��� ���� �� �� �� ���̴� ������. 
    //����� �׻� boolean (true/false)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("��1 ");
        int a = Integer.parseInt(sc. nextLine());
        System.out.print("��2 ");
        int b = Integer.parseInt(sc. nextLine());
        boolean c = a < b;// ���� a�� ���� b���� �۴�
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
        
       // ���� ����
        // && : �� ������ ture �� �븸 �� ������ ����
        // �������� false�̸� �� ������ �������� �ʴ´�.
        // || : �������� ture�̸� �� ������ �������� ������
        // �� ������ false�� ���� �� ������ �����Ѵ�.
    }

}

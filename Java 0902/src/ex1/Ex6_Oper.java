package ex1;

import java.util.Scanner;

/**
 * @author KOSTA
 * Document : Ex6_Oper Created on : 2014. 9. 2, ���� 1:56:31
 */
public class Ex6_Oper {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a�� b��"+(a==b));
        String str1= new String("1");
        String str2= new String("1");
        System.out.println("a�� b��");
    
//        Scanner Ŭ������ ����ؼ� ����ڷκ��� �Է�ó��
//        scanner sc ���� �ϸ鼭 ����
//        ���� - Ŭ������ ����ϱ� ���ؼ��� 
        Scanner sc= new Scanner(System.in);
        
        // UI���ڸ� �Է��ϼ���
        System.out.print("�޼��� �Է�1 :");
        
        // ����ڷκ��� ���ڿ��� �Է� ���� �� String msg�� �����ϱ�
        // sc.nextLine()�� �޼��尡 ȣ���� �Ǹ� string���� ��ȯ�Ǳ� ������
        // �Ʒ��� ���� ���� Ÿ���� ������ �����ؼ� ��� ���� �� �ִ�.
        // �޼��� �м�) �Է¹��� ���ڿ����� �� �� ������ �о string���� ��ȯ�Ѵ�.
        
        String msg = sc.nextLine();// blocking �޼���
        
        System. out. print("�޼��� �Է�2 :");
        String msg2 = sc.nextLine();
        
        System. out. println("==============================");
        System. out. println("�Է°�1:"+msg);
        System. out. println("�Է°�2:"+msg2);
        System. out. println("msg/msg2 �ּҰ��� ��: "+(msg==msg2));
        //string Ŭ����: ���ڿ� ���� ������ ��ü
        System.out.println("msg/msg2 �����:"+(msg.equals(msg2)));
                
        String svc1=new String("MyTest");
        String svc2=new String("MyTest");
        System.out. println("svc1/svc2 ������ ��"+(svc1.equals(svc2)));
        
    }
}

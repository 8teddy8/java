package Ex2;

import java.util.Scanner;

/**
 * @author KOSTA
 * Document : Ex2_Main Created on : 2014. 9. 11, ���� 11:29:13
 */
public class Ex2_Main {
    public static void main(String[] args) {
        
       
        // --���Ŭ���� ����
        Ex2_CallbyReference ref = new Ex2_CallbyReference();
        ref.info(num, name, age, gender, tel);
        System.out.println("�Է��Ͻ� ���� :");
        System.out.println("��ȣ :"+ref.getNum());
        System.out.println("�̸� :"+ref.getName());
        System.out.println("���� :"+ref.getAge());
        System.out.println("���� :"+ref.getGender());
        System.out.println("��ȭ��ȣ :"+ref.getTel());
        }
    }



package exam;

import java.util.Scanner;
import vo.BoardVO;

/**
 * @author KOSTA
 * Document : BoardMain Created on : 2014. 9. 11, ���� 2:06:36
 */
public class BoardMain {
    // 1. �Է�, 2. ���, 3. ���� : 1
    // ���� :
    // ���� : ('M','F','m','f')���޼���!
    // �ۼ��� :
    // ���� :
    // ���糯¥ :
    // 1. �Է�, 2. ���, 3. ���� : 2
    // ����~~~~~���� ��¥�� ���
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.println("1. �Է�, 2. ���, 3. ���� :");
        int num = Integer.parseInt(sc.nextLine());
        
        System.out.println("���� :");
        String title = sc.nextLine();
        System.out.println("���� :");
        String gender = sc.nextLine();
        System.out.println("�ۼ��� :");
        String name = sc.nextLine();
        System.out.println("���� :");
        String conte = sc.nextLine();
        System.out.println("���� ��¥ :");
        String date = sc.nextLine();
         
        BoardVO v = new BoardVO();
        v.setTitle(title);
        v.setGender(gender);
        v.setName(name);
        v.setConte(conte);
        v.setDate(date);
    }
}

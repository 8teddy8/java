package Ex2;

import Ex2.vo.MemberVO;
import java.util.Scanner;

/**
 * @author KOSTA
 * Document : Ex2_Main1 Created on : 2014. 9. 11, ���� 1:51:06
 */
public class Ex2_Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("��ȣ �Է� :");
        int num = Integer.parseInt(sc.nextLine());
        System.out.println("�̸� �Է� :");
        String name = sc.nextLine();
        System.out.println("���� �Է� :");
        String age = sc.nextLine();
        System.out.println("���� �Է� :");
        String gender = sc.nextLine();
        System.out.println("��ȭ��ȣ �Է� :");
        String tel = sc.nextLine();
        
        // VO��ü�� �����Ѵ�.
        // ������� ���� ���� �� �� Ex2_CallByReference1�� info�� ���� �� ���̱� ������
        MemberVO v = new MemberVO();
        v.setNum(num);
        v.setName(name);
        v.setAge(age);
        v.setGender(gender);
        v.setTel(tel);
        Ex2_CallbyReference1 ref = new Ex2_CallbyReference1();
        ref.info(v);
        // ���
        System.out.println("�̸� :"+ref.getVo().getName());
    }

}

package subject;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author KOSTA Document : Main Created on : 2014. 9. 16, ���� 5:43:29
 */
public class Main {

    public static void main(String[] args) {       
        ArrayList<Vo> vo = new ArrayList<>();// Vo ���� ArrayList�� ����
        Scanner sc = new Scanner(System.in);// Scanner�� ����
        while (true) {// �ý����� ���� �� ���� ����ؼ� �ݺ��ؾ��ϴ� �ݺ��� �̹Ƿ� while�� ���� ���� true�� �� ������ ���ѷ��� ��Ų��.
            System.out.print("1- ȸ�������Է�, 2 - ȸ������Ʈ���, 3 - ���� :");// UI
            int num = Integer.parseInt(sc.nextLine());
            if (num == 1) {//UI���� 1�� �Է����� �� 
                Vo vvo = new Vo();// Vo Ŭ������ vvo�� �����ϰ�, heap�� Vo�� ����� ��������ش�.
                System.out.print("ȸ�� ��ȣ:");
                vvo.setInum(Integer.parseInt(sc.nextLine()));
                System.out.print("ȸ�� �̸�:");
                vvo.setName(sc.nextLine());
                System.out.print("ȸ�� ������(���ڸ� ����):");
                vvo.setKg(Float.parseFloat(sc.nextLine()));
                System.out.print("ȸ������ ����:");
                vvo.setAgree(Boolean.parseBoolean(sc.nextLine()));
                System.out.print("ȸ�� E-Mail:");
                vvo.setMail(sc.nextLine());
                System.out.print("ȸ���� ����:");
                vvo.setAge(Integer.parseInt(sc.nextLine()));
                vo.add(vvo);

            } else if (num == 2) {// UI���� 2�� �Է��ϸ�
                for (Vo e : vo) {// ���� for������ Vo��ü�� ���� �ҷ��´�.
                    System.out.println("ȸ�� ��ȣ:" + e.getInum());
                    System.out.println("ȸ�� �̸�:" + e.getName());
                    System.out.println("ȸ�� ������:" + e.getKg());
                    System.out.println("ȸ������ ����:" + e.isAgree());
                    System.out.println("ȸ�� E-Mail:" + e.getMail());
                    System.out.println("ȸ���� ����:" + e.getAge());
                    if(e.getAge()>=19){// ȸ���� ���̰� 19�� �̻��̸� '����', �̸��̸� '�̼���'
                    System.out.println("����");
                    }else{
                        System.out.println("�̼���");
                        
                    } 
                    System.out.println("------------------------------------------------------------------");
                        
                }

            } else if (num == 3) {// UI���� 3�� �Է��ϸ�
                break;// ���ѷ����� �����.
            }

        }
    }
}

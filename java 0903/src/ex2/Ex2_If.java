package ex2;
//����߿� if, else if, for, while, break ����
//�н��� �� ������ ������ ���� �� �ֵ��� �⺻ ������
//�����ϴ� ����� �����Ѵ�.

/**
 * @author KOSTA Document : Ex2_If Created on : 2014. 9. 3, ���� 11:16:43
 */
public class Ex2_If {

    public static void main(String[] args) {
        // if(����) : ������ true �϶��� ���� �ϰڴ�.
        int su = 3;
        String msg;
        if (su > 5) {
            System.out.println("����!" );
        }
        System.out.println("���� if���� ������ �ǰ� �;��!");// if���� ���� �� ���� ;�� ������ ���� ������.
// �׷��Ƿ� "���� if~"�� if���� ������ ���� �ʴ´�.
        //���ǰ� �������� �����ϰڴ�
        if (su > 5) {
            msg = "ũ��.";
        } else {
            msg = "�۴�";
        }
        System.out.println("��� :"+msg);
    }

}

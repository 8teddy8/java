package ex1;

/**
 * @author KOSTA
 * Document : NewA Created on : 2014. 9. 5, ���� 11:29:44
 */
public class NewA {
    public static void main(String[] args) {
        NewClass ref = new NewClass();
        ref.insertPay(1000, "dd");
        int pay = ref.getpay();
        int res = pay *1000;
        System.out.println("����� �޿��� :"+res+"�Դϴ�.");
    }

}// �ڹ�Ŭ������ ������ ��, �Ӽ��� privait�� �⺻���� �Ѵ�. ���� ����ȭ

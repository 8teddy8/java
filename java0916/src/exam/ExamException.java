package exam;

import java.util.Scanner;

/**
 * @author KOSTA Document : ExamException Created on : 2014. 9. 16, ���� 9:46:35
 */
public class ExamException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 10; i++) {
            System.out.print("�� �Է� :");
            try {

                //NumberFormatException - ���ڰ� �ƴ� ��
                int num = Integer.parseInt(sc.nextLine());

                int com = (int) (Math.random() * 3);//0~2
                // ArithmeticException - 0���� �������� �� ��

                int res = num / com;
                System.out.println("��µ� ���" + res);
            } catch (NumberFormatException e) {
                System.out.println("���ڸ� �ۼ�");
                return;
            } catch (ArithmeticException e) {
                System.out.println("0���� ���� �� �����ϴ�.");
            } catch (Exception e) {
                // �������ܰ�ü�� �׻� �Ʒ��� �;� �Ѵ�.****
                // �������ܰ�ü�� ������ �Ǹ� ���� ��ü�� �ǹ̰� �������Ƿ�
                System.out.println("���ڸ� �ۼ�");
            } finally {// ������ ����Ǵ� ����!
                System.out.println("������ ����Ǹ�, �ڿ��� ��ȯ!");
            }
        }
    }
}

package ex1;

/**
 * @author KOSTA Document : Ex1_Break Created on : 2014. 9. 4, ���� 10:10:51
 */
public class Ex1_Break {

    public static void main(String[] args) {
        // break: Ư�� ������ ���߸� �ݺ����� Ż���ϴ� ���
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if(j==3) break;// ���� for������ �ش��
                System.out.println(i+":"+j);
            }// ���� break�� ���⸦ ���� ������ ����.
        }
        xx: for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if(j==3) break xx;// break label�� 
                System.out.println(i+":"+j);
            }
        }//���ʹ� �ٸ��� ���⸦ ��������
    }
}


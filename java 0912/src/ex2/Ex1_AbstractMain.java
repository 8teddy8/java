package ex2;

/**
 * @author KOSTA
 * Document : Ex1_AbstractMain Created on : 2014. 9. 12, ���� 12:05:00
 */
// �߻�Ŭ������ �߻�ż��尡 �ִٸ� �ݵ�� ������ �ؼ� ����ؾ� ���
// �޾Ƽ� �߻�Ŭ������ ������ �ִ� �ٸ��ڿ�(���⼭�� 1000��)�� ��� �� �� �ִ�.
// ��, �߻��� �䱸������ ������ �ȴ�.
public class Ex1_AbstractMain extends Ex1_Abstract{
    
    @Override
    public void moveMount(){
        System.out.println("���� �Ű���"+getMoney()+"�޾��� ������");
    }
    public static void main(String[] args) {
        Ex1_Abstract ref = new Ex1_AbstractMain();
        // �θ��� �޼��带 ȣ�������� ������(*****)��
        // �ڽ� �޼��尡 ȣ���� ��..
        // (����) �߻� Ŭ������ ���������� new�� �����ڷ� �����Ǿ
        // ��� �� �� ���� ������ �̿ϼ��� �߻�޼���� ���� �صθ�
        // ������ �� �ڽĿ� ���ؼ� �ϼ��� �Ǿ ����� ��.
        ref.moveMount();
        // �ڽ��� �����ؼ� ��ü�� ������ ���
    }

}

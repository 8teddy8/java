package ex3;

/**
 * @author KOSTA
 * Document : Ex_Construtor Created on : 2014. 9. 11, ���� 3:48:10
 */
public class Ex_Construtor {
    //������ �ܰ� ��>JVM����
    // �����ڰ� �����ڸ� ���� ���� �ص��� ������ �����Ϸ��� �⺻ �����ڸ� ���� �صд�.
    // �����ڴ� Ŭ������� ���� ��ȯ���� ����.
    //����: ����Ŭ������ �ʱ�ȭ ��Ű�� ���� �����̴�.
    // �⺻������
//    public Ex_Construtor(){
//        
//    }
    // �����ڰ� ������ �����ڰ� ������ �����Ϸ��� �⺻�����ڸ� ������ �ʴ´�.******
    //�ڹٿ����� ���� Ŭ������ ���� ������ �� �ִ� ����� 2����
    // 1. �޼���(setter)
    // 2. ������
    private String msg;
    // ����� �ڿ��� �ʱ�ȭ �ϴ� ����!!!!
    //���ڰ��� �ִ� ������
    public Ex_Construtor(String msg){
        this.msg = msg;
    }
    public static void main(String[] args) {
        //Ŭ������ ��ü�� ����
        Ex_Construtor ref = new Ex_Construtor("����");//����
        ref.test();
    }
    
}

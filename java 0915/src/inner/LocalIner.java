package inner;

/**
 * @author KOSTA
 * Document : LocalIner Created on : 2014. 9. 15, ���� 2:45:00
 */
// ���ó���Ŭ����: Ư�� �޼��� �ȿ��� ���ǵǴ� Ŭ����.
// ���������� ���� �����̶� �޼��尡 ȣ�� �� �� ��ü�� ���� �� �� �ְ�
// �޼����� ������ ������ ���� ������ ���� �ڵ����� �Ҹ��!

public class LocalIner {
    private int a = 100;// ��� ����
    public void myMethod(int n){
        int b = 200;// �޼��� ���� ���� ����
        final int c = 300;// ���
        //Local ����Ŭ����
        class Inner{
            public void getData(){
                // �ܺ�Ŭ������ �ڿ� ����
                System.out.println("int a :"+a);
                // ���������� ���� ����
                // jdk5~7������� �ݵ�� ���������� ����� �����ؾ� ��
                System.out.println("local int b "+n);
            }
        }
        Inner i = new Inner();
        i.getData();
    }
    public static void main(String[] args) {
        LocalIner
    }
}

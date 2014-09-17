package inner;

/**
 * @author KOSTA
 * Document : StaticInner Created on : 2014. 9. 15, ���� 3:21:19
 */
public class StaticInner {
    int a = 10;
    private int b = 100;
    static int c = 200;
    static class Inner{
        // ��¿ �� ���� ����Ŭ���� �ȿ��� static �ڿ��� ����ϰ� �ȴٸ�
        // �� �� ����Ŭ������ static ���� Ŭ���� ���� �Ǿ�� �Ѵ�.
        static int d = 1000;
        public void printData(){
//            System.out.println("int a :"+a);
//            System.out.println("int b :"+b);// static�� �ƴ� ��ü�� �ݵ�� �����ϰ� ����ؾ� �Ѵ�.
            System.out.println("int c :"+c);
        }
    }
    public static void main(String[] args) {
        //����Ŭ���� ���� �� printData()�� ȣ���غ���
        StaticInner.Inner inner = new StaticInner.Inner();
        inner.printData();
    }
}

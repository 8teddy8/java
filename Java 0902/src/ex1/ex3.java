package ex1;

public class ex3 {
    public static void main(String[] arge){
        byte A=10;
        byte B=1;
        // demotion: ū �ڷ������� ���� �ڷ������� �����Ͱ� �̵� �� ��
        // �ڷ��� �ս��� ���� �� ����(ĳ����)
        // promotion: ���� �ڷ������� ū �ڷ������� �����Ͱ� �̵� �� ��
        // �ڿ������� ����
        // jvm�� int 4����Ʈ ������ ������ ���� �� �� int������ �°� ��Ŵ
        // �׷��� a+b�� ������ �̷�� �� �� int ������ ���� ����� ������ �Ǳ� ������
        // �̰��� byte c�� �����ϱ� �������� demotion�� �Ͼ
        byte C=(byte) (A+B);
        System.out.println("A+B="+C);
        int D= A+B;
        System.out.println("D :"+D);
        // JDK 7���� �����ϴ� �ڸ��� ǥ��, _�� �����Ѵ�.
        int e= 123_123;
        System.out.println(e);
        //long
        long myL = A+B;
        int f= (int) myL;
        
    }
}

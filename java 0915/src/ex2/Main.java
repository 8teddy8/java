package ex2;

/**
 * @author KOSTA
 * Document : Main Created on : 2014. 9. 15, ���� 10:18:05
 */
public class Main {
    public static void main(String[] args) {
        // �߻� Ŭ������ new�� ������ �� ����.
        Super su = new Super() {

            @Override
            public void draw(String msg) {
                 System.out.println("��: "+msg);
            }
        };
        su.draw("test");
        Super[] ar = new Super[2];
        ar[0] = new A();
        ar[1] = new B();
        String[] msg = {"�簢��", "������"};
        int i = 0 ;
        for(Super e: ar){
            e.draw(msg[i]);
            i++;
        }
    }
}

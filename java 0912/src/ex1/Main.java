package ex1;

/**
 * @author KOSTA
 * Document : Main Created on : 2014. 9. 12, ���� 10:19:30
 */
public class Main {
    public static void main(String[] args) {
        D_carPhone ref = new D_carPhone("����Ʈ3","500000",1000, "20px");
        System.out.println("�𵨸� :"+ref.model);
        System.out.println("���� :"+ref.getNumber());
        System.out.println("ȭ�� :"+ref.getChord());
        System.out.println("�ȼ� :"+ref.getPixel());
    }

}

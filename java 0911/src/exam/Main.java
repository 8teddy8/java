package exam;

/**
 * @author KOSTA Document : Main Created on : 2014. 9. 11, ���� 10:35:15
 */
public class Main {

    public static void main(String[] args) {
        Home home = new Home();
        PaintA a = new PaintA();
        PaintB b = new PaintB();

        a.paintHome(home, "Red");
        b.paintHome(home, "Blue");
        System.out.println("�빮 ������ :" + home.getDoorColor());
    }
}

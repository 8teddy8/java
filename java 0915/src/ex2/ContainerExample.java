package ex2;

import ex1.Animal;
import ex3.Interface;
import ex3.MsgBank;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author KOSTA
 * Document : ContainerExample Created on : 2014. 9. 15, ���� 10:33:55
 */
//extends JFrame �� ����base, container �� ��ü�̹Ƿ�
// ������� ó���ϴ� ���� �ٶ����ϴ�.
// �������̽��� ���� ������ �����ϴ�
public class ContainerExample extends JFrame implements Interface,MsgBank{
    private JPanel p,p2;
    private JButton btn;
    private JLabel lb;
    
    public ContainerExample() {
        p = new JPanel();
        p2 = new JPanel();
        // �����ؼ� ���
        String msg = new Animal().msg("Ŭ��");
        // ������ �ϱ� ���� �����͸�Ŭ������ ���
        Animal ani = new Animal(){

            @Override
            public String msg(String msg) {
                return " [��Ʈ] "+msg;
            }
            
        };
                p.add(btn = new JButton(ani.msg("���̹�ư")));
        add(p,"North");
        p2.add(lb = new JLabel("�ӽó���"));
        p2.setBackground(Color.PINK);
        add(p2);
        setLocation(100, 100);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public int getA() {
        return A;
    }

    @Override
    public int getB() {
        return b;
    }
    //MyBank �������̽��� ������
    @Override
    public String printMsg(String msg) {
       return "My Msg"+msg;
    }
    
}
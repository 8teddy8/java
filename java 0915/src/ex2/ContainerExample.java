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
 * Document : ContainerExample Created on : 2014. 9. 15, 오전 10:33:55
 */
//extends JFrame 는 가장base, container 인 객체이므로
// 상속으로 처리하는 것이 바람직하다.
// 인터페이스는 다중 구현이 가능하다
public class ContainerExample extends JFrame implements Interface,MsgBank{
    private JPanel p,p2;
    private JButton btn;
    private JLabel lb;
    
    public ContainerExample() {
        p = new JPanel();
        p2 = new JPanel();
        // 생성해서 사용
        String msg = new Animal().msg("클릭");
        // 재정의 하기 위한 내부익명클래스로 사용
        Animal ani = new Animal(){

            @Override
            public String msg(String msg) {
                return " [하트] "+msg;
            }
            
        };
                p.add(btn = new JButton(ani.msg("마이버튼")));
        add(p,"North");
        p2.add(lb = new JLabel("임시내용"));
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
    //MyBank 인터페이스를 재정의
    @Override
    public String printMsg(String msg) {
       return "My Msg"+msg;
    }
    
}

package ex1;

import java.util.Scanner;

/**
 * @author KOSTA
 * Document : Ex1_RoboMain Created on : 2014. 9. 5, ���� 10:36:40
 */
public class Ex1_RoboMain {
    // Ex1_Robo.class �޾Ƽ� �����ϱ����� �۾�
    public static void main(String[] args) {
        Ex1_Robo ref = new Ex1_Robo();
        // �����ڷ��� Ex_Robo ref; ����
        // new �����ڸ� ����Ͽ� Ex1_Robo()�� Heap������ ����
        //�Ӽ��� ���� �Ҵ�
        ref.power= true;// ���� �� ������ �ִ� Ex_Robo��ü�� �ڿ��� power�� 
        // true���� ������ ����.
        // �� �� ref.isPower() �޼��带 ȣ���ϸ� �翬�� true���� ������ �ִ� 
        // power ���ΰ��� Ȯ�� �� �� �ִ�.
        if(ref.isPower() == true){
            System.out.println("�κ��� ������ �������ϴ�.");
        }else{
            System.out.println("�κ��� ������ �������ϴ�.");
        }
        // ��������: Ex_Robo ��ü�� move()�� ȣ���ؼ�
        // �κ��� �����̰� �����ϰ� ���α׷��� �Ͻÿ�.
           
        Scanner sc = new Scanner(System.in);
  
        System.out.println("�κ��� ������ �ӵ��� ���� �ּ���: ");
        boolean rv = ref.move(0);
        if(!rv){
            System.out.println("�κ� ���ۿ� ������ �ֽ��ϴ�.");
    }
        
    }
}

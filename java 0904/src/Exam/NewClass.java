package Exam;

import java.util.Scanner;

/**
 * @author KOSTA
 * Document : NewClass Created on : 2014. 9. 4, ���� 2:03:21
 */
public class NewClass {
    // -----------
    //[�¸��ϼ̽��ϴ�.]
    //---------------
    //ui - 1- Ȧ, 2- ¦, 3 - ����: 1
    //TOTAL : 2
    //cpu: ¦
    //you: Ȧ
    //[����� �����ϴ�.]
    //....................
    //UI - 1 - Ȧ, 2-¦, 3 - ���� : 3
    //WIN : 11
    //�·� : 100%
    //��ǰ: �ι��� ������(100, 90, 80, 70, 60)
    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 1;
        int win = 0;
             while (true) {                 
                 System.out.print("1 - Ȧ, 2 - ¦, 3 - ���� : ");
            int num = Integer.parseInt(sc.nextLine());
                 System.out.println("TOTAL : "+total);
                 total++;
                 int cnum = (int) (Math.random()*2);
                        if (cnum == 1) {
                            System.out.println("CPU : Ȧ");
                        }else if (cnum == 2){
                            System.out.println("CPU : ¦");
                            System.out.println("YOU : Ȧ");
                            
                            System.out.println("[����� �¸��ϼ̽��ϴ�]");
                
            } else if (num == 2) {
                System.out.println("¦");
            } else if (num == 3) {
                System.out.println("3�� ����!");
                break;
            } else {
                System.out.println("�߸� �� ��!");   
            }
        }
    }
}
    



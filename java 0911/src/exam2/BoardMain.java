package exam2;

import java.util.Scanner;

/**
 * @author KOSTA
 * Document : BoardMain Created on : 2014. 9. 11, ���� 3:12:43
 */
public class BoardMain {
    public static void main(String[] args) {
       
        BoardControl vc = new BoardControl();
        Scanner sc = new Scanner(System.in);
        boad: while(true){
            System.out.print("1. �Է�, 2. ���, 3. ���� :");
            int menu = Integer.parseInt(sc.nextLine());
            switch(menu){
                case 1:
                    BoardVO vo = new BoardVO();
                    System.out.print("���� :");
                    vo.setTitle(sc.nextLine());
                    System.out.println("���� (");
                    vo.setGender(sc.nextLine());
                    System.out.println("�ۼ���: ");
                    vo.setName(sc.nextLine());
                    System.out.println("����: ");
                    vo.setContent(sc.nextLine());
                    System.out.println("���� ��¥: ");
                    vo.setDate(sc.nextLine());
                    
                    boolean result = vc.info(vo);
                    if(result == false){
                        System.out.println("�������� M,F,m,f�� �Է� �����մϴ�.");
                    }
                break;
                case 2:
                    System.out.println("���� :"+vc.getVo().getTitle());
                    System.out.println("���� :"+vc.getVo().getGender());
                    System.out.println("�ۼ��� :"+vc.getVo().getName());
                    System.out.println("���� :"+vc.getVo().getContent());
                    System.out.println("���� ��¥ :"+vc.getVo().getDate());
                    break;
                case 3:
                    System.out.println("�����մϴ�!");
                    break boad;
            
            }
        }
    }
}

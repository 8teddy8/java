package exam2;

import java.util.Scanner;

/**
 * @author KOSTA
 * Document : BoardMain Created on : 2014. 9. 11, 오후 3:12:43
 */
public class BoardMain {
    public static void main(String[] args) {
       
        BoardControl vc = new BoardControl();
        Scanner sc = new Scanner(System.in);
        boad: while(true){
            System.out.print("1. 입력, 2. 출력, 3. 종료 :");
            int menu = Integer.parseInt(sc.nextLine());
            switch(menu){
                case 1:
                    BoardVO vo = new BoardVO();
                    System.out.print("제목 :");
                    vo.setTitle(sc.nextLine());
                    System.out.println("성별 (");
                    vo.setGender(sc.nextLine());
                    System.out.println("작성자: ");
                    vo.setName(sc.nextLine());
                    System.out.println("내용: ");
                    vo.setContent(sc.nextLine());
                    System.out.println("현재 날짜: ");
                    vo.setDate(sc.nextLine());
                    
                    boolean result = vc.info(vo);
                    if(result == false){
                        System.out.println("성별에는 M,F,m,f만 입력 가능합니다.");
                    }
                break;
                case 2:
                    System.out.println("제목 :"+vc.getVo().getTitle());
                    System.out.println("성별 :"+vc.getVo().getGender());
                    System.out.println("작성자 :"+vc.getVo().getName());
                    System.out.println("내용 :"+vc.getVo().getContent());
                    System.out.println("현재 날짜 :"+vc.getVo().getDate());
                    break;
                case 3:
                    System.out.println("종료합니다!");
                    break boad;
            
            }
        }
    }
}

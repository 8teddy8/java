package exam;

import java.util.Scanner;
import vo.BoardVO;

/**
 * @author KOSTA
 * Document : BoardMain Created on : 2014. 9. 11, 오후 2:06:36
 */
public class BoardMain {
    // 1. 입력, 2. 출력, 3. 종료 : 1
    // 제목 :
    // 성별 : ('M','F','m','f')경고메세지!
    // 작성자 :
    // 내용 :
    // 현재날짜 :
    // 1. 입력, 2. 출력, 3. 종료 : 2
    // 제목~~~~~현재 날짜가 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.println("1. 입력, 2. 출력, 3. 종료 :");
        int num = Integer.parseInt(sc.nextLine());
        
        System.out.println("제목 :");
        String title = sc.nextLine();
        System.out.println("성별 :");
        String gender = sc.nextLine();
        System.out.println("작성자 :");
        String name = sc.nextLine();
        System.out.println("내용 :");
        String conte = sc.nextLine();
        System.out.println("현재 날짜 :");
        String date = sc.nextLine();
         
        BoardVO v = new BoardVO();
        v.setTitle(title);
        v.setGender(gender);
        v.setName(name);
        v.setConte(conte);
        v.setDate(date);
    }
}

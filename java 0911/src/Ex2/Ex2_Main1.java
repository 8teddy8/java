package Ex2;

import Ex2.vo.MemberVO;
import java.util.Scanner;

/**
 * @author KOSTA
 * Document : Ex2_Main1 Created on : 2014. 9. 11, 오후 1:51:06
 */
public class Ex2_Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("번호 입력 :");
        int num = Integer.parseInt(sc.nextLine());
        System.out.println("이름 입력 :");
        String name = sc.nextLine();
        System.out.println("나이 입력 :");
        String age = sc.nextLine();
        System.out.println("성별 입력 :");
        String gender = sc.nextLine();
        System.out.println("전화번호 입력 :");
        String tel = sc.nextLine();
        
        // VO객체를 생성한다.
        // 사용자의 값을 저장 한 후 Ex2_CallByReference1의 info로 전달 할 것이기 때문에
        MemberVO v = new MemberVO();
        v.setNum(num);
        v.setName(name);
        v.setAge(age);
        v.setGender(gender);
        v.setTel(tel);
        Ex2_CallbyReference1 ref = new Ex2_CallbyReference1();
        ref.info(v);
        // 출력
        System.out.println("이름 :"+ref.getVo().getName());
    }

}

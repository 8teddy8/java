package subject;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author KOSTA Document : Main Created on : 2014. 9. 16, 오후 5:43:29
 */
public class Main {

    public static void main(String[] args) {       
        ArrayList<Vo> vo = new ArrayList<>();// Vo 형의 ArrayList를 생성
        Scanner sc = new Scanner(System.in);// Scanner을 생성
        while (true) {// 시스템이 끝날 때 까지 계속해서 반복해야하는 반복문 이므로 while을 쓰고 값에 true를 써 줌으로 무한루프 시킨다.
            System.out.print("1- 회원정보입력, 2 - 회원리스트출력, 3 - 종료 :");// UI
            int num = Integer.parseInt(sc.nextLine());
            if (num == 1) {//UI에서 1을 입력했을 때 
                Vo vvo = new Vo();// Vo 클레스를 vvo로 선언하고, heap에 Vo를 만들어 연결시켜준다.
                System.out.print("회원 번호:");
                vvo.setInum(Integer.parseInt(sc.nextLine()));
                System.out.print("회원 이름:");
                vvo.setName(sc.nextLine());
                System.out.print("회원 몸무게(숫자만 기입):");
                vvo.setKg(Float.parseFloat(sc.nextLine()));
                System.out.print("회원동의 여부:");
                vvo.setAgree(Boolean.parseBoolean(sc.nextLine()));
                System.out.print("회원 E-Mail:");
                vvo.setMail(sc.nextLine());
                System.out.print("회원의 나이:");
                vvo.setAge(Integer.parseInt(sc.nextLine()));
                vo.add(vvo);

            } else if (num == 2) {// UI에서 2를 입력하면
                for (Vo e : vo) {// 향상된 for문으로 Vo객체의 값을 불러온다.
                    System.out.println("회원 번호:" + e.getInum());
                    System.out.println("회원 이름:" + e.getName());
                    System.out.println("회원 몸무게:" + e.getKg());
                    System.out.println("회원동의 여부:" + e.isAgree());
                    System.out.println("회원 E-Mail:" + e.getMail());
                    System.out.println("회원의 나이:" + e.getAge());
                    if(e.getAge()>=19){// 회원의 나이가 19세 이상이면 '성년', 미만이면 '미성년'
                    System.out.println("성년");
                    }else{
                        System.out.println("미성년");
                        
                    } 
                    System.out.println("------------------------------------------------------------------");
                        
                }

            } else if (num == 3) {// UI에서 3을 입력하면
                break;// 무한루프를 벗어난다.
            }

        }
    }
}

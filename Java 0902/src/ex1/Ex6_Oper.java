package ex1;

import java.util.Scanner;

/**
 * @author KOSTA
 * Document : Ex6_Oper Created on : 2014. 9. 2, 오후 1:56:31
 */
public class Ex6_Oper {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a와 b비교"+(a==b));
        String str1= new String("1");
        String str2= new String("1");
        System.out.println("a와 b비교");
    
//        Scanner 클래스를 사용해서 사용자로부터 입력처리
//        scanner sc 선언 하면서 생성
//        정정 - 클래스를 사용하기 위해서는 
        Scanner sc= new Scanner(System.in);
        
        // UI글자를 입력하세요
        System.out.print("메세지 입력1 :");
        
        // 사용자로부터 문자열을 입력 받은 후 String msg에 저장하기
        // sc.nextLine()란 메서드가 호출이 되면 string으로 반환되기 때문에
        // 아래와 같이 같은 타입의 변수에 저장해서 사용 도리 수 있다.
        // 메서드 분서) 입력받은 문자열ㅇ르 한 줄 단위로 읽어서 string으로 반환한다.
        
        String msg = sc.nextLine();// blocking 메서드
        
        System. out. print("메세지 입력2 :");
        String msg2 = sc.nextLine();
        
        System. out. println("==============================");
        System. out. println("입력값1:"+msg);
        System. out. println("입력값2:"+msg2);
        System. out. println("msg/msg2 주소값을 비교: "+(msg==msg2));
        //string 클래스: 문자열 값을 가지는 객체
        System.out.println("msg/msg2 내용비교:"+(msg.equals(msg2)));
                
        String svc1=new String("MyTest");
        String svc2=new String("MyTest");
        System.out. println("svc1/svc2 내용을 비교"+(svc1.equals(svc2)));
        
    }
}

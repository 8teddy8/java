package ex2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author KOSTA
 * Document : Ex3_Generic Created on : 2014. 9. 16, 오후 3:31:44
 */
// jdk 5 부터 객체간의 캐스팅 문제를 해결하기 위해서
// 전용 컬렉션을 도입

public class Ex3_Generic {
    public static void main(String[] args) {
        //Vector 와 ArrayList 차이는 동기화 지원 여부!
        //Vector가 동기화를 지원 하는 기능! 있지만 다른 부분으로 대체가능!
        //Generic - String만 담을수 있는 ArrayList
        //jdk7부터 변경된 요소 6이하는 오류
        ArrayList<String> str = new ArrayList<>();
        
        str.add("ok");
        str.add(String.valueOf(10));
        str.add(String.valueOf(3.14f));
        System.out.println(str.size());
        for(String e: str){
            System.out.println(e);
            }
        System.out.println("interator--------------------------");
        Iterator<String> it = str.iterator();
        while(it.hasNext()){
            String string = it.next();
            System.out.println(string);
        }
        ArrayList<Integer> num = new ArrayList<>();
        num.add(Integer.parseInt("10"));
        // 과제] ArrayList를 사용하다보니까 
        // 회원정보를 저장하고 싶은데, 제네릭으로 표현되면
        // 어떻게 각기 다른 자료형들을 넣어서 회원정보에 저장할 수 있을까?
        // 실행화면
        /*1- 회원정보입력, 2 - 회원리스트출력, 3 - 종료:1
            회원번호(int)
            회원이름(String)
            회원의 몸무게(float)
            회원의 동의여부(boolean)
            회원의 이메일(String)
            1 - 회원정보입력, 2 - 회원리스트출력, 3 - 종료:1
               --여러번 반복해서 회원을 5명정도 추가-
            1 - 회원정보입력, 2 - 회원리스트출력, 3 - 종료:2
            회원번호 :1
            이름 : 홍수환
            몸무게 : 65kg
            동의여부 : false
            이메일 : 
            나이 : 18
            [미성년자] / 성년
        ---------------------------
            -- 출력  --------
        [ 과제 ] - B조 홍수환 : ArrayList를 응용한 회원관리
        */
    }
}

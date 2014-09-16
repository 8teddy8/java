package ex1;

/**
 * @author KOSTA
 * Document : Ex3_Oper Created on : 2014. 9. 3, 오전 11:04:36
 */
public class Ex3_Oper {
    public static void main(String[] args) {
        // 1씩 증가, 감소하는 연산자 |++, -- 가 변수 앞에 있느냐, 뒤에 있느나가 중요한 연산자.
        int a = 10;
        int b = 12;
        System.out.println(a++);// 후치
        System.out.println(++a);// 전치
        System.out.println(++b);
        System.out.println(b++);
        System.out.println(b);
        System.out.println(b);
    }

}

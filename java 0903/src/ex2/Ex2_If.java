package ex2;
//제어문중에 if, else if, for, while, break 등을
//학습한 후 간단한 게임을 만들 수 있도록 기본 문법을
//적용하는 방법을 습득한다.

/**
 * @author KOSTA Document : Ex2_If Created on : 2014. 9. 3, 오전 11:16:43
 */
public class Ex2_If {

    public static void main(String[] args) {
        // if(조건) : 조건이 true 일때만 실행 하겠다.
        int su = 3;
        String msg;
        if (su > 5) {
            System.out.println("실행!" );
        }
        System.out.println("나도 if문의 가족이 되고 싶어요!");// if문의 끝은 그 줄의 ;이 찍히는 순간 끈난다.
// 그러므로 "나도 if~"는 if문에 포함이 되지 않는다.
        //조건과 나머지를 싱행하겠다
        if (su > 5) {
            msg = "크다.";
        } else {
            msg = "작다";
        }
        System.out.println("결과 :"+msg);
    }

}

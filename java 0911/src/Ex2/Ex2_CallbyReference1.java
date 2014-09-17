package Ex2;

import Ex2.vo.MemberVO;

/**
 * @author KOSTA
 * Document : Ex2_CallbyReference Created on : 2014. 9. 11, 오전 11:23:43
 */
public class Ex2_CallbyReference1 {
    //연습문제 : 현재 클래스는 변화에 유연하지 못한 클래스로 설계되어있다.
    // info란 메서드에게 자원을 추가해서 사용하기 위해서
    // 메서드의 인자값도 늘여야 하고, 멤버필드 및 setter/ getter도 늘려야 한다.
    // private boolean agree를 추가해서 사용해 볼 것.
    // POJO,CallByReference를 적절히 사용하면 해결 됨.
    private MemberVO vo;
   
    // 한 사람의 정보를 출력 - 번호, 이름, 나이, 성별, 전화번호
    public void info(MemberVO vo){
        //만약 가공이 필요하다면?
        this.vo = vo;
       
    }
    public MemberVO getVo(){
        return vo;
    }
}   
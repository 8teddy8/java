package ex1;

/**
 * @author KOSTA
 * Document : Ex1_Robo Created on : 2014. 9. 5, 오전 10:30:56
 * 클래스를 설계하고 정의 하는 방법
 * 접근 제한자: public, default
 * class 명은 앞 천 글자는 항상 대문자로 작성, 식별자 명명 규칙
 * main 메서드는 분리한다.
 */


public class Ex1_Robo {
    /** 
     * @serialField power는 전원의 값을 기억하는 속성.
     *  ture가 켜져있는 상태, false가 꺼진 상태
     */
    boolean power;
    /**
     * @serialField col 은 색상값이며, 빨강, 노랑 등으로 제어할 때 사용한다.
     * 
     */
    String col;
    /**
     * 
     * @param num : 로봇의 상태값으로 0보다 큰 수에 동작되도록 되어 있음
     * @return boolean 값으로 당신이 받아서 알아서 제어 하시오ㅎㅎ
     */
    public boolean move(int num){
        boolean res = false;
        if(num <= 0){
            System.out.println("로보가 멈춥니다.");
        }else{
            System.out.println("로보가"+num+"의 속도로 움직입니다.");
            res = true;
           
        }
        return res;
    }
    //멤버필드의 power의 값을 돌려주는 메서드
    public boolean isPower(){
        return power;
    }

}

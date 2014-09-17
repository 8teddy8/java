package ex1;

import java.util.Scanner;

/**
 * @author KOSTA
 * Document : Ex1_RoboMain Created on : 2014. 9. 5, 오전 10:36:40
 */
public class Ex1_RoboMain {
    // Ex1_Robo.class 받아서 개발하기위한 작업
    public static void main(String[] args) {
        Ex1_Robo ref = new Ex1_Robo();
        // 참조자료형 Ex_Robo ref; 선언
        // new 연산자를 사용하여 Ex1_Robo()를 Heap영역에 생성
        //속성에 값을 할당
        ref.power= true;// 실제 힙 영역에 있는 Ex_Robo객체의 자원인 power에 
        // true값을 지정한 상태.
        // 그 후 ref.isPower() 메서드를 호출하면 당연히 true값을 가지고 있는 
        // power 값인것을 확인 할 수 있다.
        if(ref.isPower() == true){
            System.out.println("로보의 전원이 켜졌습니다.");
        }else{
            System.out.println("로보의 전원이 꺼졌습니다.");
        }
        // 연습문제: Ex_Robo 객체의 move()를 호출해서
        // 로보가 움직이게 적절하게 프로그래밍 하시오.
           
        Scanner sc = new Scanner(System.in);
  
        System.out.println("로봇이 움직일 속도를 정해 주세요: ");
        boolean rv = ref.move(0);
        if(!rv){
            System.out.println("로보 동작에 문제가 있습니다.");
    }
        
    }
}

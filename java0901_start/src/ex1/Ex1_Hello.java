//패키지-묶음, 꾸러미, (같은 성격의 클래스들을 모아놓는 집합)
package ex1;
//public: 접근제한자, public 다른 모든 패키지에서 자유롭게
// 접근이 가능한 제한자. (가장 넓은 의미의 제한접근)
// class 크래스이름: 클래스이름-식별자
// 식별자 규칙: 반드시 대문자로 만들어야 한다.
// 특수기호, 숫자, 공백 $는 제외하고 나머지는 안된다.
// $는 
public class Ex1_Hello {// 클래스 정의 시작
   
    // void: 메서드는 동작이며, 동작은 호출된 시점에서 실행되는데
    // 이때 동작된 메서드는 호출된 곳으로
    // 수행한 값을 변환하게 되어있다. 하지만 수행할 값이 없다면
    // 반환값 자리에 void라고 명시된다.
    // main메서드는 누가 호출할까요?
    // 프로그램의 시작이라고도 한다.
    // 스택에 들어가는 순서도 정리해 보기....
    // JVM호출시에 값이 있으면 String[] args 사용
    public static void main(String[] args) {
        System. out. println("여기는 줄바꿈이 안됨");
        System. out.println("hello~~~!");// 메서드 호출
    }
}// 클래스 정의 종료
// 모든 클래스의 설계는 {} 안에서 이루어져야 한다.

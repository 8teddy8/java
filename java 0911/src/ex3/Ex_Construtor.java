package ex3;

/**
 * @author KOSTA
 * Document : Ex_Construtor Created on : 2014. 9. 11, 오후 3:48:10
 */
public class Ex_Construtor {
    //컴파일 단계 ㅡ>JVM실행
    // 개발자가 생성자를 따로 저의 해두지 않으면 컴파일러가 기본 생성자를 정의 해둔다.
    // 생성자는 클래스명과 같고 반환형이 없다.
    //목적: 현재클래스를 초기화 시키는 것이 목적이다.
    // 기본생성자
//    public Ex_Construtor(){
//        
//    }
    // 개발자가 만들어둔 생성자가 있으면 컴파일러가 기본생성자를 만들지 않는다.******
    //자바에서는 현재 클래스에 값을 주입할 수 있는 방법이 2가지
    // 1. 메서드(setter)
    // 2. 생성자
    private String msg;
    // 멤버의 자원을 초기화 하는 목적!!!!
    //인자값이 있는 생성자
    public Ex_Construtor(String msg){
        this.msg = msg;
    }
    public static void main(String[] args) {
        //클래스를 객체로 생성
        Ex_Construtor ref = new Ex_Construtor("하이");//생성
        ref.test();
    }
    
}

package ex1;

/**
 * @author KOSTA
 * Document : D_carPhone Created on : 2014. 9. 12, 오전 9:45:51
 */
// 상속은 컴파일 단계에서 부모 클래스인 Ex1_Super와 결합된다.
// 자바에서 상속은 단일 상속이다.
public class D_carPhone extends Ex1_Super{
    private String  pixel;
    private int chord;
    public D_carPhone(String model, String num, int chord, String pixel){
        this.pixel = pixel;
        // 부모의 자원을 참조하기 위해서 super란 키워드를 사용
        super.model = model;
        // 부모의 자원이라고 해도 private는 접근이 불가능 하다.
        // 부모클래스에 정의된 메서드도 자신의 자원처럼 호출이 가능!
        setNumber(num);
//        this.chord = chord;  <- 같은 이름의 chord가 있으면 this를 붙이면 자신의 값을 상속받아 사용하고, super를 붙이면 부모의 값을 상속받아 사용
        super.chord = chord;
    }

    public String getPixel() {
        return pixel;
    }


}
// 연습문제 MP3Phone 클래스를 만들어서 Ex1_Super를 상속받고
// 멤버필드에는 int size// 저장용량
// 하나두고 위와 같이 초기화 시키시오.
// 즉, Ex1_Super는 자식 클래스에 재사용이 되는 부모 클래스로 설계되었다.
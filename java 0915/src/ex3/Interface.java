package ex3;
// interface 설계 : 인터페이스는 메뉴판처럼 상수와 추상 메서드로 
public interface Interface {
    public static final int A = 100;// 상수
    int b = 200;// 변수가 아니고 상수이다. 인터페이스에서는 
    public abstract int getA();// 추상 메서드
    public int getB();//추상 메서드
}

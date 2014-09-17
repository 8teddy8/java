package inner;

/**
 * @author KOSTA
 * Document : StaticInner Created on : 2014. 9. 15, 오후 3:21:19
 */
public class StaticInner {
    int a = 10;
    private int b = 100;
    static int c = 200;
    static class Inner{
        // 어쩔 수 없이 내부클래스 안에서 static 자원을 사용하게 된다면
        // 이 때 내부클래스는 static 내부 클래스 정의 되어야 한다.
        static int d = 1000;
        public void printData(){
//            System.out.println("int a :"+a);
//            System.out.println("int b :"+b);// static이 아닌 객체는 반드시 생성하고 사용해야 한다.
            System.out.println("int c :"+c);
        }
    }
    public static void main(String[] args) {
        //내부클래스 생성 후 printData()를 호출해보기
        StaticInner.Inner inner = new StaticInner.Inner();
        inner.printData();
    }
}

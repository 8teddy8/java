package inner;

/**
 * @author KOSTA
 * Document : MemverInner Created on : 2014. 9. 15, 오후 2:05:19
 */
// 내부클래스: 특정클래스 안에 또 다른 클래스가 정의 되는 것을 의미한다.
// 종류: 멤모, 로컬, static, 익명
public class MemverInner {
    private int a = 10;
    private int b;
    private int c;
    

    public MemverInner() {
        b=100;
        c=200;
        
    }

    // 멤버클래스를 정의
    public class Inner{
        public void printData(){
            System.out.println("외부클래스의 private접근 가능 :"+a);
            System.out.println("외부클래스의 private접근 가능 :"+b);
            System.out.println("외부클래스의 private접근 가능 :"+c);
        }

        private boolean col() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
       
        }
     // 내부클래스 생성 및 접근
        public static void main(String[] args) {
            //외부 클래스를 생성한다.
//            MemverInner outer = new MemverInner();
//            // 외부클래스의 주소를 통해서 내부클래스를 생성 및 접근
//            MemverInner.Inner inner = outer.new Inner();
            
            // 연습문제 축약시켜보기 두줄로
            MemverInner.Inner inner = new MemverInner().new Inner();
            inner.printData();
            System.out.println(inner.col());
    }
}

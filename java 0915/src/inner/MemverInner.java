package inner;

/**
 * @author KOSTA
 * Document : MemverInner Created on : 2014. 9. 15, ���� 2:05:19
 */
// ����Ŭ����: Ư��Ŭ���� �ȿ� �� �ٸ� Ŭ������ ���� �Ǵ� ���� �ǹ��Ѵ�.
// ����: ���, ����, static, �͸�
public class MemverInner {
    private int a = 10;
    private int b;
    private int c;
    

    public MemverInner() {
        b=100;
        c=200;
        
    }

    // ���Ŭ������ ����
    public class Inner{
        public void printData(){
            System.out.println("�ܺ�Ŭ������ private���� ���� :"+a);
            System.out.println("�ܺ�Ŭ������ private���� ���� :"+b);
            System.out.println("�ܺ�Ŭ������ private���� ���� :"+c);
        }

        private boolean col() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
       
        }
     // ����Ŭ���� ���� �� ����
        public static void main(String[] args) {
            //�ܺ� Ŭ������ �����Ѵ�.
//            MemverInner outer = new MemverInner();
//            // �ܺ�Ŭ������ �ּҸ� ���ؼ� ����Ŭ������ ���� �� ����
//            MemverInner.Inner inner = outer.new Inner();
            
            // �������� �����Ѻ��� ���ٷ�
            MemverInner.Inner inner = new MemverInner().new Inner();
            inner.printData();
            System.out.println(inner.col());
    }
}

package exam;

/**
 * @author KOSTA
 * Document : Exam1_CallbyValue Created on : 2014. 9. 11, ¿ÀÀü 9:32:23
 */
public class Exam1_CallbyValue {
    public void test(int n){
        n = n+10;
        System.out.println("n1 :"+n);
        
    }
    public static void main(String[] args) {
        Exam1_CallbyValue r = new Exam1_CallbyValue();
        int n = 10;
        r.test(n);
        System.out.println("n2 :"+n);
    }

}

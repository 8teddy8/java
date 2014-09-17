package Ex1;

/**
 * @author KOSTA
 * Document : Exam1_CallbyValue Created on : 2014. 9. 11, 오전 9:32:23
 */
public class Ex1_CallbyValue {
    public static void test(int n){
        n = n+10;// 사본
        System.out.println("n1 :"+n);
        
    }
    public static void main(String[] args) {
        int n = 10;// 원본
        test(n);
        System.out.println("n2 :"+n);
    }

}


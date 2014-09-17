package ex1;

/**
 * @author KOSTA
 * Document : NewA Created on : 2014. 9. 5, 오전 11:29:44
 */
public class NewA {
    public static void main(String[] args) {
        NewClass ref = new NewClass();
        ref.insertPay(1000, "dd");
        int pay = ref.getpay();
        int res = pay *1000;
        System.out.println("당신의 급여는 :"+res+"입니다.");
    }

}// 자바클래스를 설계할 때, 속성은 privait를 기본으로 한다. 정보 은닉화

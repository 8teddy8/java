package ex1;

/**
 * @author KOSTA
 * Document : NewClass Created on : 2014. 9. 5, 오전 11:26:16
 */
// 현재 클래스는 은행, 금융, 보험 등 관련 회사에서 사용되는
// 보안이 필요한 코드라면.........
// a팀과b팀이 현재 코드에서 접근해서 작업을 할 수 있는데
// 금액을 세팅 할 팀이 a팀만 가능하게 하려면?
public class NewClass {
    private int pay;// 이 클래스 안에서만 사용할 수 있도록 private로 
    public void insertPay(int p,String str){
        if (str.equals("dd")){
            System.out.println("당신은 접근 권한이 없습니다.");
            System.exit(0);// 프로그램 종료
        }
        pay=p;// 호출시 받은 1000값을 멤버필드에 저장해 놓겠다.
    }
    public int getpay(){
        return pay;
        
    }

}

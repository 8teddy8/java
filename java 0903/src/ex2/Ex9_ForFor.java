package ex2;

/**
 * @author KOSTA
 * Document : Ex9_ForFor Created on : 2014. 9. 3, 오후 3:51:46
 */
public class Ex9_ForFor {
    public static void main(String[] args) {
        // 다중 for()문 : 큰 for가 반복 될 때마다 작은 fordms그 안에서
        // 계속 초기식 부터 조건식까지 반복을 주기적으로 수행하게된다.
        /*for(초기식; 조건식; 증감식){
            실행문;
            for(초기식; 조건식; 증감식){
                실행문;
            }
        }
        */
        for(int i=1; i<=9; i++){
            for(int j=1; j<=100; j++){
                System.out.print(j+"x"+i+"="+(i*j)+"\t");
            }
            System.out.println("");
        }
    }

}

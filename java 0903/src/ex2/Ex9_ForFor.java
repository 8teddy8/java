package ex2;

/**
 * @author KOSTA
 * Document : Ex9_ForFor Created on : 2014. 9. 3, ���� 3:51:46
 */
public class Ex9_ForFor {
    public static void main(String[] args) {
        // ���� for()�� : ū for�� �ݺ� �� ������ ���� fordms�� �ȿ���
        // ��� �ʱ�� ���� ���ǽı��� �ݺ��� �ֱ������� �����ϰԵȴ�.
        /*for(�ʱ��; ���ǽ�; ������){
            ���๮;
            for(�ʱ��; ���ǽ�; ������){
                ���๮;
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

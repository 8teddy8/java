package ex2;

/**
 * @author KOSTA Document : Ex8_For Created on : 2014. 9. 3, ���� 2:11:33
 */
public class Ex8_For {

    public static void main(String[] args) {
       loopFor();
    }
    
        
    
    private static void loopFor() {
        //�ʱ��, �ʱ�ȭ �� =>�ϻ����� �� �ѹ��� �ǹ�
        // for(�ʱ��; ���ǽ�; ������){
        // ���๮;
        // }
        for(int i=0; i<10; i++){
            System.out.println(i+"");
           
        }
    }
}
// for, if, else
// ��������
// ���� �Է��ϼ���. 9
// ������ �Է��ϼ���. 3
//[Result]
// 0 1 2
// 3 4 5
// 6 7 8
// ���� �Է��ϼ���. 9
// ������ �Է��ϼ���. 5
// [Result]
// 0 1 2 3 4 
// 5 6 7 8 9
package ex1;

/**
 * @author KOSTA
 * Document : NewClass Created on : 2014. 9. 5, ���� 11:26:16
 */
// ���� Ŭ������ ����, ����, ���� �� ���� ȸ�翡�� ���Ǵ�
// ������ �ʿ��� �ڵ���.........
// a����b���� ���� �ڵ忡�� �����ؼ� �۾��� �� �� �ִµ�
// �ݾ��� ���� �� ���� a���� �����ϰ� �Ϸ���?
public class NewClass {
    private int pay;// �� Ŭ���� �ȿ����� ����� �� �ֵ��� private�� 
    public void insertPay(int p,String str){
        if (str.equals("dd")){
            System.out.println("����� ���� ������ �����ϴ�.");
            System.exit(0);// ���α׷� ����
        }
        pay=p;// ȣ��� ���� 1000���� ����ʵ忡 ������ ���ڴ�.
    }
    public int getpay(){
        return pay;
        
    }

}

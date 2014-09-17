package ex1;

/**
 * @author KOSTA
 * Document : Ex1_Robo Created on : 2014. 9. 5, ���� 10:30:56
 * Ŭ������ �����ϰ� ���� �ϴ� ���
 * ���� ������: public, default
 * class ���� �� õ ���ڴ� �׻� �빮�ڷ� �ۼ�, �ĺ��� ��� ��Ģ
 * main �޼���� �и��Ѵ�.
 */


public class Ex1_Robo {
    /** 
     * @serialField power�� ������ ���� ����ϴ� �Ӽ�.
     *  ture�� �����ִ� ����, false�� ���� ����
     */
    boolean power;
    /**
     * @serialField col �� �����̸�, ����, ��� ������ ������ �� ����Ѵ�.
     * 
     */
    String col;
    /**
     * 
     * @param num : �κ��� ���°����� 0���� ū ���� ���۵ǵ��� �Ǿ� ����
     * @return boolean ������ ����� �޾Ƽ� �˾Ƽ� ���� �Ͻÿ�����
     */
    public boolean move(int num){
        boolean res = false;
        if(num <= 0){
            System.out.println("�κ��� ����ϴ�.");
        }else{
            System.out.println("�κ���"+num+"�� �ӵ��� �����Դϴ�.");
            res = true;
           
        }
        return res;
    }
    //����ʵ��� power�� ���� �����ִ� �޼���
    public boolean isPower(){
        return power;
    }

}

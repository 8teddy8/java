package ex1;

/**
 * @author KOSTA
 * Document : Ex1_Exception Created on : 2014. 9. 16, ���� 9:28:48
 */
/*
Exception : ������ �����̸� ���α׷������� ó���Ѵ�.
    -�Ϲ����� ���� : ������ �� �� �߻��ϴ� ����
        ex) I/O�� ������ �а��� �ϴµ� ����� ������ ���ٸ�
    -���� �� ����
        ex) 0���� ������ ���α׷� ��, ������ ���ڿ� ���ڸ� �ִ´ٴ� ��.
Error : ġ������ �����̸� JVM�� �����Ͽ� ó���Ѵ�.
���� ó��
try{
    ���ܰ� �߻� ������ �����;
    ���๮; - ���ܰ� �߻��Ǹ� ������ �ȵ�*******
}catch(���ܰ�ü �����){
    ���� ���� �����;
}
*/
public class Ex1_Exception {
    public static void main(String[] args) {
        int[] var = {10,200,30};
        for(int i=0; i<=3; i++){
            // ���� �߻����� �迭�� �ε����� 3�� ã�� �� - 3�� ����
            // ArrayIndexOutOfBoundsException: 3
            // ����ó��
            try {
                System.out.println(var[i]);// i==3�� �Ѿ��� ��
                System.out.println("");// 
            } catch (Exception e) {
                System.out.println("�迭�� ������ �Ѿ����ϴ�.");
            }
        System.out.println(var[i]);
    }
        System.out.println("���α׷��� ��");
    }
}

package ex3;

/**
 * @author KOSTA
 * Document : Main Created on : 2014. 9. 11, ���� 4:17:54
 */
public class Main {
    public static void main(String[] args) {
        ExamConst ref = new ExamConst("ȫ�浿");
        if(!ref.insert()){
            System.out.println("����� ���θ� �����մϴ�.^^");
            
        }
        ExamConst ref1 = new ExamConst(20);
        if(!ref1.insert()){
            System.out.println("����� ���θ� �����մϴ�.^^");
        }else{
            System.out.println("�����մϴ�. ��÷!");
        }
    }
}

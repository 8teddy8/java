package ex3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author KOSTA
 * Document : ExamConst Created on : 2014. 9. 11, ���� 3:59:56
 */
public class ExamConst {
    private String name;
    private int age;
    private String date;//���� ��¥..

    // �����ڸ� ����ؼ� ���� �ʱ�ȭ �ϱ�
    // ��ü�� ������ ���� �پ��� ����� �����ε����� ��������� �Ѵ�.
    public ExamConst(String name) {
        this.name = name;
        age= 19;
        // �͸����� ��ü�� �����ؼ� ����ϴ� ����� ��
        date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }

    public ExamConst(int age) {
        this.age = age;
        name= "ȣȣȣ";
         date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }

    public ExamConst(String name, int age) {
        this.name = name;
        
        this.age = age; 
        date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }
   
    
    
    public boolean insert(){
        if (age>19){
            System.out.println(name+"�� ���");
            return true;
        }else{
            System.out.println(name+"�� ���ٱ���!");
            return false;
        }
    }
    

}

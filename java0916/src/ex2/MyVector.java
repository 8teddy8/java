package ex2;

import java.util.Vector;

/**
 * @author KOSTA
 * Document : MyVector Created on : 2014. 9. 16, ���� 12:14:03
 */
public class MyVector {
    public static void main(String[] args) {
        //�÷����� �ڷᱸ���̰�, ��ü�� ������ ��!
        
        Vector v = new Vector();
        v.add(new String("Test"));
        v.add(10);
        v.add('A');
        v.add(true);
        v.add(3.14f);
        v.add(100L);
        System.out.println("������ ũ�� :"+v.size());
        for(Object e:v){
            if(e instanceof String){
                System.out.println("String :"+e);
            }else if(e instanceof Integer){
                System.out.println("Integer :"+e);                
            }else if(e instanceof Character){
                System.out.println("Character :"+e);                
            }else if(e instanceof Float){
                System.out.println("Float :"+e);
            }else if(e instanceof Long){
                System.out.println("Long :"+e);
            }
            //Vector�� ����� �� ��ü�� �ڷ����� ������ �̸����� ����ϱ�
            
        }
    }
}

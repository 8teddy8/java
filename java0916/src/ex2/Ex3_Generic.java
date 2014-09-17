package ex2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author KOSTA
 * Document : Ex3_Generic Created on : 2014. 9. 16, ���� 3:31:44
 */
// jdk 5 ���� ��ü���� ĳ���� ������ �ذ��ϱ� ���ؼ�
// ���� �÷����� ����

public class Ex3_Generic {
    public static void main(String[] args) {
        //Vector �� ArrayList ���̴� ����ȭ ���� ����!
        //Vector�� ����ȭ�� ���� �ϴ� ���! ������ �ٸ� �κ����� ��ü����!
        //Generic - String�� ������ �ִ� ArrayList
        //jdk7���� ����� ��� 6���ϴ� ����
        ArrayList<String> str = new ArrayList<>();
        
        str.add("ok");
        str.add(String.valueOf(10));
        str.add(String.valueOf(3.14f));
        System.out.println(str.size());
        for(String e: str){
            System.out.println(e);
            }
        System.out.println("interator--------------------------");
        Iterator<String> it = str.iterator();
        while(it.hasNext()){
            String string = it.next();
            System.out.println(string);
        }
        ArrayList<Integer> num = new ArrayList<>();
        num.add(Integer.parseInt("10"));
        // ����] ArrayList�� ����ϴٺ��ϱ� 
        // ȸ�������� �����ϰ� ������, ���׸����� ǥ���Ǹ�
        // ��� ���� �ٸ� �ڷ������� �־ ȸ�������� ������ �� ������?
        // ����ȭ��
        /*1- ȸ�������Է�, 2 - ȸ������Ʈ���, 3 - ����:1
            ȸ����ȣ(int)
            ȸ���̸�(String)
            ȸ���� ������(float)
            ȸ���� ���ǿ���(boolean)
            ȸ���� �̸���(String)
            1 - ȸ�������Է�, 2 - ȸ������Ʈ���, 3 - ����:1
               --������ �ݺ��ؼ� ȸ���� 5������ �߰�-
            1 - ȸ�������Է�, 2 - ȸ������Ʈ���, 3 - ����:2
            ȸ����ȣ :1
            �̸� : ȫ��ȯ
            ������ : 65kg
            ���ǿ��� : false
            �̸��� : 
            ���� : 18
            [�̼�����] / ����
        ---------------------------
            -- ���  --------
        [ ���� ] - B�� ȫ��ȯ : ArrayList�� ������ ȸ������
        */
    }
}

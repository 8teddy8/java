package Ex2;

import Ex2.vo.MemberVO;

/**
 * @author KOSTA
 * Document : Ex2_CallbyReference Created on : 2014. 9. 11, ���� 11:23:43
 */
public class Ex2_CallbyReference1 {
    //�������� : ���� Ŭ������ ��ȭ�� �������� ���� Ŭ������ ����Ǿ��ִ�.
    // info�� �޼��忡�� �ڿ��� �߰��ؼ� ����ϱ� ���ؼ�
    // �޼����� ���ڰ��� �ÿ��� �ϰ�, ����ʵ� �� setter/ getter�� �÷��� �Ѵ�.
    // private boolean agree�� �߰��ؼ� ����� �� ��.
    // POJO,CallByReference�� ������ ����ϸ� �ذ� ��.
    private MemberVO vo;
   
    // �� ����� ������ ��� - ��ȣ, �̸�, ����, ����, ��ȭ��ȣ
    public void info(MemberVO vo){
        //���� ������ �ʿ��ϴٸ�?
        this.vo = vo;
       
    }
    public MemberVO getVo(){
        return vo;
    }
}   
package ex2;

/**
 * @author KOSTA
 * Document : Ex1_Abstract Created on : 2014. 9. 12, ���� 12:01:00
 */
// �߻�޼��带 ���� Ŭ������ �ݵ�� �߻�Ŭ�������� �Ѵ�.
public abstract class Ex1_Abstract {
    private String money;
    public Ex1_Abstract(){
        money = "1000���";
        
    }
    // �߻�޼��� : ���� �Űܶ�.
    abstract public void moveMount();
    // �Ϲݸ޼���
    public String getMoney() {
        return money;
    }
    
}

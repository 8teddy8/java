package exam2;

/**
 * @author KOSTA Document : BoardComtrol Created on : 2014. 9. 11, ���� 3:00:03
 */
// ���� ���� ��ü�� has a ���踦 ���� �����ϱ� ����
public class BoardControl {

    private BoardVO vo;

    public boolean info(BoardVO vo) {
        if (!vo.getGender().equalsIgnoreCase("m") && !vo.getGender().equalsIgnoreCase("f")) {
            return false;
        } else {
            this.vo = vo;
            return true;
        }
    }

    public BoardVO getVo() {
        return vo;
    }
    
    

    
}

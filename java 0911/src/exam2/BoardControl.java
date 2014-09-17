package exam2;

/**
 * @author KOSTA Document : BoardComtrol Created on : 2014. 9. 11, 오후 3:00:03
 */
// 값을 가진 객체를 has a 관계를 통해 가공하기 위해
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

package exam;

import vo.BoardVO;

/**
 * @author KOSTA
 * Document : Board Created on : 2014. 9. 11, ¿ÀÈÄ 2:24:58
 */
public class Board {
    private BoardVO vo;
    
    public void info(BoardVO vo){
        this.vo = vo;
    }
    public BoardVO getVo(){
        return vo;
    }

}

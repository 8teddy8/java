package exam;

/**
 * @author KOSTA Document : Home Created on : 2014. 9. 11, 오전 10:18:13
 */
public class Home {// 1. Main을 생성하기 전 Home을 생성
    // 2. 일 할 회사 (PaintA와 PaintB를 생서
    // 3. 일을 시켜야 하므로 Main을 생성

    private String doorColor;

    public String getDoorColor() {// 대문의 색상 : 정보를 은닉
        // setter/getter를 사용하여 캡슐화
        return doorColor;
    }

    public void setDoorColor(String doorC) {// 대문의 색상을 지정하도록 제공
        doorColor = doorC;
    }
}

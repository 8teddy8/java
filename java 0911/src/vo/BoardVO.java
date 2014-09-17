package vo;

/**
 * @author KOSTA
 * Document : BoardVO Created on : 2014. 9. 11, 오후 2:21:37
 */
public class BoardVO {
    // 제목,성별,작성자,내용,날짜
    private String title, gender, name , conte, date;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConte() {
        return conte;
    }

    public void setConte(String conte) {
        this.conte = conte;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
}

package Ex2;

/**
 * @author KOSTA
 * Document : Ex2_CallbyReference Created on : 2014. 9. 11, 오전 11:23:43
 */
public class Ex2_CallbyReference {
    //연습문제 : 현재 클래스는 변화에 유연하지 못한 클래스로 설계되어있다.
    // info란 메서드에게 자원을 추가해서 사용하기 위해서
    // 메서드의 인자값도 늘여야 하고, 멤버필드 및 setter/ getter도 늘려야 한다.
    // private boolean agree를 추가해서 사용해 볼 것.
    // POJO,CallByReference를 적절히 사용하면 해결 됨.
    private int num;
    private String name, age, gender, tel;
   
    // 한 사람의 정보를 출력 - 번호, 이름, 나이, 성별, 전화번호
    public void info(int num, String name, String age, String gender, String tel){
        // this : 현재 객체의 주소값 - 지역변수와 멤버필드가 이름이 같으면 지역변수에 우선순위가 있다.!!******
        num = num;// 그러므로 이 때는 멤버필드와 지역변수가 같아질 수 없다.
        // 이럴 때 구별하기 위해서 이름을 달리 주거나, this란 키워드를 붙여주면 된다. 붙인쪽에 객체의 주소, 멤버 자원(this.num)의 형태로 기억됨.
        
        this.num = num;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.tel = tel;
//        System.out.println("입력하신 정보 :");
//        System.out.println("번호 :"+num);
//        System.out.println("이름 :"+name);
//        System.out.println("나이 :"+age);
//        System.out.println("성별 :"+gender);
//        System.out.println("전화번호 :"+tel);
    }

    //메서드 영역에서 alt + insert 키를 누르면 Generate 메뉴가 뜬다.
    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getTel() {
        return tel;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    

}

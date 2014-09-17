package Ex2;

/**
 * @author KOSTA
 * Document : Ex2_CallbyReference Created on : 2014. 9. 11, ���� 11:23:43
 */
public class Ex2_CallbyReference {
    //�������� : ���� Ŭ������ ��ȭ�� �������� ���� Ŭ������ ����Ǿ��ִ�.
    // info�� �޼��忡�� �ڿ��� �߰��ؼ� ����ϱ� ���ؼ�
    // �޼����� ���ڰ��� �ÿ��� �ϰ�, ����ʵ� �� setter/ getter�� �÷��� �Ѵ�.
    // private boolean agree�� �߰��ؼ� ����� �� ��.
    // POJO,CallByReference�� ������ ����ϸ� �ذ� ��.
    private int num;
    private String name, age, gender, tel;
   
    // �� ����� ������ ��� - ��ȣ, �̸�, ����, ����, ��ȭ��ȣ
    public void info(int num, String name, String age, String gender, String tel){
        // this : ���� ��ü�� �ּҰ� - ���������� ����ʵ尡 �̸��� ������ ���������� �켱������ �ִ�.!!******
        num = num;// �׷��Ƿ� �� ���� ����ʵ�� ���������� ������ �� ����.
        // �̷� �� �����ϱ� ���ؼ� �̸��� �޸� �ְų�, this�� Ű���带 �ٿ��ָ� �ȴ�. �����ʿ� ��ü�� �ּ�, ��� �ڿ�(this.num)�� ���·� ����.
        
        this.num = num;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.tel = tel;
//        System.out.println("�Է��Ͻ� ���� :");
//        System.out.println("��ȣ :"+num);
//        System.out.println("�̸� :"+name);
//        System.out.println("���� :"+age);
//        System.out.println("���� :"+gender);
//        System.out.println("��ȭ��ȣ :"+tel);
    }

    //�޼��� �������� alt + insert Ű�� ������ Generate �޴��� ���.
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

package ex1;

/**
 * @author KOSTA
 * Document : D_carPhone Created on : 2014. 9. 12, ���� 9:45:51
 */
// ����� ������ �ܰ迡�� �θ� Ŭ������ Ex1_Super�� ���յȴ�.
// �ڹٿ��� ����� ���� ����̴�.
public class D_carPhone extends Ex1_Super{
    private String  pixel;
    private int chord;
    public D_carPhone(String model, String num, int chord, String pixel){
        this.pixel = pixel;
        // �θ��� �ڿ��� �����ϱ� ���ؼ� super�� Ű���带 ���
        super.model = model;
        // �θ��� �ڿ��̶�� �ص� private�� ������ �Ұ��� �ϴ�.
        // �θ�Ŭ������ ���ǵ� �޼��嵵 �ڽ��� �ڿ�ó�� ȣ���� ����!
        setNumber(num);
//        this.chord = chord;  <- ���� �̸��� chord�� ������ this�� ���̸� �ڽ��� ���� ��ӹ޾� ����ϰ�, super�� ���̸� �θ��� ���� ��ӹ޾� ���
        super.chord = chord;
    }

    public String getPixel() {
        return pixel;
    }


}
// �������� MP3Phone Ŭ������ ���� Ex1_Super�� ��ӹް�
// ����ʵ忡�� int size// ����뷮
// �ϳ��ΰ� ���� ���� �ʱ�ȭ ��Ű�ÿ�.
// ��, Ex1_Super�� �ڽ� Ŭ������ ������ �Ǵ� �θ� Ŭ������ ����Ǿ���.
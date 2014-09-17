package ex1;

/**
 * @author KOSTA
 * Document : Client Created on : 2014. 9. 15, ���� 9:28:53
 */
public class Client {
    public static void main(String[] args) {
        // �迭 ����� ������ ó��
        // �迭�� ��ü
        // - �Ϲ��ڷ��� �迭, �����ڷ��� �迭
        // - ������ �迭�� ������ �迭
        Animal[] ar = new Animal[3];
        ar[0] = new Bird();
        ar[1] = new Dog();
        ar[2] = new Cat();
        int size = ar.length;
        System.out.println("�迭�� ũ��"+size);
        // ȿ������ �ڵ带 ����ϴ� ���
        for(int i=0; i<size; i++){
            ar[i].cry();
        }
        System.out.println("--------------------------");
        // jdk5���� ���� for��
        // (�迭/ �÷����� ��ü �������� : in�� �ǹ�) ������{
        // ����
        // }
        for(Animal e : ar){
            e.cry();
        }
    }
}

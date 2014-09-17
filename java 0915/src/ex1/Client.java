package ex1;

/**
 * @author KOSTA
 * Document : Client Created on : 2014. 9. 15, 오전 9:28:53
 */
public class Client {
    public static void main(String[] args) {
        // 배열 사용한 다형성 처리
        // 배열은 객체
        // - 일반자료형 배열, 참조자료형 배열
        // - 일차원 배열과 다차원 배열
        Animal[] ar = new Animal[3];
        ar[0] = new Bird();
        ar[1] = new Dog();
        ar[2] = new Cat();
        int size = ar.length;
        System.out.println("배열의 크기"+size);
        // 효율적인 코드를 사용하는 방법
        for(int i=0; i<size; i++){
            ar[i].cry();
        }
        System.out.println("--------------------------");
        // jdk5부터 향상된 for문
        // (배열/ 컬렉션의 객체 지역변수 : in의 의미) 변수명{
        // 실행
        // }
        for(Animal e : ar){
            e.cry();
        }
    }
}

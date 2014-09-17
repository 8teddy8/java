package ex1;

/**
 * @author KOSTA Document : Ex1_Break Created on : 2014. 9. 4, 오전 10:10:51
 */
public class Ex1_Break {

    public static void main(String[] args) {
        // break: 특정 조건을 갖추면 반복문을 탈출하는 제어문
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if(j==3) break;// 작은 for문에만 해당됨
                System.out.println(i+":"+j);
            }// 위의 break는 여기를 빠져 나오는 것임.
        }
        xx: for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if(j==3) break xx;// break label문 
                System.out.println(i+":"+j);
            }
        }//위와는 다르게 여기를 빠져나옴
    }
}


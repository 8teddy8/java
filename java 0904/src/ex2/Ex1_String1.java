package ex2;

/**
 * @author KOSTA Document : Ex1_String1 Created on : 2014. 9. 4, 오후 12:01:39
 */
public class Ex1_String1 {

    //1부터 10까지의 합을 구한다.

    public static void main(String[] args) {
        int total = 0;
        int num = 1;//초기식
        while (num <= 10) {//조건식
         total += num;
         num++;//증감식
        }
        System.out.println("total : "+total);
    }
    

}

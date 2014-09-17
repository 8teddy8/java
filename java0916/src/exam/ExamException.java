package exam;

import java.util.Scanner;

/**
 * @author KOSTA Document : ExamException Created on : 2014. 9. 16, 오전 9:46:35
 */
public class ExamException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 10; i++) {
            System.out.print("수 입력 :");
            try {

                //NumberFormatException - 숫자가 아닌 값
                int num = Integer.parseInt(sc.nextLine());

                int com = (int) (Math.random() * 3);//0~2
                // ArithmeticException - 0으로 나눌려고 할 때

                int res = num / com;
                System.out.println("출력된 결과" + res);
            } catch (NumberFormatException e) {
                System.out.println("숫자만 작성");
                return;
            } catch (ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다.");
            } catch (Exception e) {
                // 상위예외객체가 항상 아래에 와야 한다.****
                // 상위예외객체가 실행이 되면 하위 객체가 의미가 없어지므로
                System.out.println("숫자만 작성");
            } finally {// 무조건 수행되는 개념!
                System.out.println("무조건 실행되며, 자원을 반환!");
            }
        }
    }
}

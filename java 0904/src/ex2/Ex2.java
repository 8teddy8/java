package ex2;

import java.util.Scanner;

/**
 * @author KOSTA Document : Ex2 Created on : 2014. 9. 4, ���� 12:08:35
 */
public class Ex2 {

    // While���� �ݺ������� ���� �˻��ϴ� �ݸ�, do~while���� �־��� ��ɹ��� �� �� ������ �Ŀ� �ݺ������� �˻��Ѵ�.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int selection;
        do {
            System.out.print("Select number : ");
            selection = in.nextInt();
            
            System.out.println("Your number is " + selection);
            
        }
        while (selection !=0);
    }

}

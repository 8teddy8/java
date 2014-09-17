package ex2;

import java.util.Scanner;

/**
 * @author KOSTA Document : Ex2 Created on : 2014. 9. 4, 오후 12:08:35
 */
public class Ex2 {

    // While문은 반복조건을 먼저 검사하는 반면, do~while문은 주어진 명령문을 한 번 수행한 후에 반복조건을 검사한다.

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

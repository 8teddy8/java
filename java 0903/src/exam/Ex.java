package exam;

import java.util.Scanner;

/**
 * @author KOSTA Document : Ex Created on : 2014. 9. 3, 오후 4:05:48
 */
public class Ex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("단 입력: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.print("범위 입력: ");
        int b = Integer.parseInt(sc.nextLine());
        int c = a - b / 2;
        int d = a + b / 2;
        for (int i = 0; i <= 9; i++) {
            for (int j = c; j <= d; j++) {
                if (i == 0) {
                    System.out.print(" " + j + "단\t");
                } else {
                    if (j >= 0) {
                        System.out.print(j + "x" + i + "=" + (i * j) + "\t");
                    } else {
                        System.out.print("*********\t");
                    }
                }
            }
            System.out.println("");
        }
    }
}
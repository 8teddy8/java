package exam;

import java.util.Scanner;

/**
 * @author KOSTA Document : Ex Created on : 2014. 9. 3, ���� 4:05:48
 */
public class Ex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("�� �Է�: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.print("���� �Է�: ");
        int b = Integer.parseInt(sc.nextLine());
        int c = a - b / 2;
        int d = a + b / 2;
        for (int i = 0; i <= 9; i++) {
            for (int j = c; j <= d; j++) {
                if (i == 0) {
                    System.out.print(" " + j + "��\t");
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
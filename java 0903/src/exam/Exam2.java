package exam;

import java.util.Scanner;

/**
 * @author KOSTA
 * Document : Exam2 Created on : 2014. 9. 3, ���� 2:39:33
 */
public class Exam2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("���� �Է��ϼ���.");
        int a = Integer.parseInt(sc.nextLine());
        System.out.print("������ �Է��ϼ���.");
        int b = Integer.parseInt(sc.nextLine());
        System.out.println("[Rusult]");
        for(int i=0; i<=a; i++){
            if(i % b == 0 && i !=0){
            System.out.println();
        }
            System.out.print(i+"\t");
        
        
    }

    }
}
// for, if, else
// ��������
// ���� �Է��ϼ���. 9
// ������ �Է��ϼ���. 3
//[Result]
// 0 1 2
// 3 4 5
// 6 7 8
// ���� �Է��ϼ���. 9
// ������ �Է��ϼ���. 5
// [Result]
// 0 1 2 3 4 
// 5 6 7 8 9
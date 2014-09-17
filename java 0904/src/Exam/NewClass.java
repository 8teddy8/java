package Exam;

import java.util.Scanner;

/**
 * @author KOSTA
 * Document : NewClass Created on : 2014. 9. 4, ¿ÀÈÄ 2:03:21
 */
public class NewClass {
    // -----------
    //[½Â¸®ÇÏ¼Ì½À´Ï´Ù.]
    //---------------
    //ui - 1- È¦, 2- Â¦, 3 - Á¾·á: 1
    //TOTAL : 2
    //cpu: Â¦
    //you: È¦
    //[´ç½ÅÀº Á³½À´Ï´Ù.]
    //....................
    //UI - 1 - È¦, 2-Â¦, 3 - Á¾·á : 3
    //WIN : 11
    //½Â·ü : 100%
    //»óÇ°: µÎ¹ÙÀÌ ±¹¹ÎÂ÷(100, 90, 80, 70, 60)
    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 1;
        int win = 0;
             while (true) {                 
                 System.out.print("1 - È¦, 2 - Â¦, 3 - Á¾·á : ");
            int num = Integer.parseInt(sc.nextLine());
                 System.out.println("TOTAL : "+total);
                 total++;
                 int cnum = (int) (Math.random()*2);
                        if (cnum == 1) {
                            System.out.println("CPU : È¦");
                        }else if (cnum == 2){
                            System.out.println("CPU : Â¦");
                            System.out.println("YOU : È¦");
                            
                            System.out.println("[´ç½ÅÀº ½Â¸®ÇÏ¼Ì½À´Ï´Ù]");
                
            } else if (num == 2) {
                System.out.println("Â¦");
            } else if (num == 3) {
                System.out.println("3Àº Á¾·á!");
                break;
            } else {
                System.out.println("Àß¸ø µÈ ¼ö!");   
            }
        }
    }
}
    



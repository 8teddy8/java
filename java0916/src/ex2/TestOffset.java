package ex2;

/**
 * @author KOSTA
 * Document : TestOffset Created on : 2014. 9. 16, ¿ÀÈÄ 3:12:00
 */
public class TestOffset {
    public static void main(String[] args) {
        String str = "abcdefghijk";
        System.out.println("String = "+str);
        int retvel = str.offsetByCodePoints(0, 2);
        System.out.println(retvel);
        System.out.println(str.charAt(retvel));
        System.out.println("");
    }// 
}

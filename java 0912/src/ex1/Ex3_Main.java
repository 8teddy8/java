package ex1;

/**
 * @author KOSTA
 * Document : Ex3_Main Created on : 2014. 9. 12, ¿ÀÀü 10:52:07
 */
public class Ex3_Main {
    public static void main(String[] args) {
        Ex3_Sub ref1 = new Ex3_Sub("30¼¼", "±è±æµ¿", 3000);
        ref1.subMethod();
        System.out.println(ref1.superMethod());
        
        ref1.superCar();
        System.out.println("===============================================");
        Ex3_Super ref2 = new Ex3_Sub("31", "±è±æµ¿", 3100);
        ref2.superCar();
    }
}

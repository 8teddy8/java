package ex1;

/**
 * @author KOSTA
 * Document : Main Created on : 2014. 9. 12, ¿ÀÀü 10:19:30
 */
public class Main {
    public static void main(String[] args) {
        D_carPhone ref = new D_carPhone("°¶³ëÆ®3","500000",1000, "20px");
        System.out.println("¸ðµ¨¸í :"+ref.model);
        System.out.println("°¡°Ý :"+ref.getNumber());
        System.out.println("È­À½ :"+ref.getChord());
        System.out.println("ÇÈ¼¿ :"+ref.getPixel());
    }

}

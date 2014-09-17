package exam;

/**
 * @author KOSTA
 * Document : Client Created on : 2014. 9. 15, ¿ÀÈÄ 1:44:07
 */
public class Client {
    public static void main(String[] args) {
        Animal[] ar = new Animal[3];
        ar[0] = new Bird();
        ar[1] = new Dog();
        ar[2] = new Cat();
        ar[0].cry();
        ar[1].cry();
        ar[2].cry();
        }
    
    
}

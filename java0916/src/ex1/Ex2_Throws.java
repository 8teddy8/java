package ex1;

/**
 * @author KOSTA Document : Ex2_Throws Created on : 2014. 9. 16, 오전 10:23:21
 */
public class Ex2_Throws {

    public void setData(String m) {
        if(m.length()>=1){
            String str = m.substring(0, 1);
            printData(str);
        }
    }
    //throws 호출한 쪽으로 위임
    public void printData(String m) throws NumberFormatException{
        int dan = Integer.parseInt(m);
        System.out.println(dan + "단");
        System.out.println("----------------");
        for (int i = 0; i < 9; i++) {
            System.out.println(dan + "x" + (i + 1) + "=" + (dan * (i + 1)));
        }
    }
   
}

package ex1;

/**
 * @author KOSTA
 * Document : Ex1_Exception Created on : 2014. 9. 16, 오전 9:28:48
 */
/*
Exception : 가벼운 오류이며 프로그램적으로 처리한다.
    -일반적인 예외 : 컴파일 할 때 발생하는 오류
        ex) I/O시 파일을 읽고자 하는데 대상이 파일이 없다면
    -실행 시 예외
        ex) 0으로 나누는 프로그램 등, 문자형 숫자에 문자를 넣는다는 등.
Error : 치명적인 오류이며 JVM에 의존하여 처리한다.
예외 처리
try{
    예외가 발생 가능한 문장들;
    실행문; - 예외가 발생되면 수행이 안됨*******
}catch(예외객체 변명수){
    예외 문장 수행들;
}
*/
public class Ex1_Exception {
    public static void main(String[] args) {
        int[] var = {10,200,30};
        for(int i=0; i<=3; i++){
            // 예외 발생지점 배열의 인덱스가 3을 찾을 때 - 3은 없음
            // ArrayIndexOutOfBoundsException: 3
            // 예외처리
            try {
                System.out.println(var[i]);// i==3을 넘었을 때
                System.out.println("");// 
            } catch (Exception e) {
                System.out.println("배열의 범위를 넘었습니다.");
            }
        System.out.println(var[i]);
    }
        System.out.println("프로그램의 끝");
    }
}

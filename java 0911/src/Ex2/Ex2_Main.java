package Ex2;

import java.util.Scanner;

/**
 * @author KOSTA
 * Document : Ex2_Main Created on : 2014. 9. 11, 오전 11:29:13
 */
public class Ex2_Main {
    public static void main(String[] args) {
        
       
        // --사용클래스 생성
        Ex2_CallbyReference ref = new Ex2_CallbyReference();
        ref.info(num, name, age, gender, tel);
        System.out.println("입력하신 정보 :");
        System.out.println("번호 :"+ref.getNum());
        System.out.println("이름 :"+ref.getName());
        System.out.println("나이 :"+ref.getAge());
        System.out.println("성별 :"+ref.getGender());
        System.out.println("전화번호 :"+ref.getTel());
        }
    }



package com.bitparctice.web.bmicalc;

import java.util.Scanner;

/**
 * packageName: com.bitparctice.web
 * fileName        : BmiCalcDemo
 * author           : chohyungook
 * date               : 2022-01-25
 * desc            : BMI 지수 계산기 컨트롤러
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         chohyungook        최초 생성
 */
public class BmiCalcDemo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        BmiCalcAPP bmiCalcAPP= new BmiCalcAPP();
        System.out.println(bmiCalcAPP.MAIN_NAME);
        System.out.println("성함을 입력해주세요.");
        System.out.println("키를 입력해주세요(예시 1m72 = 1.72로 입력)");
        System.out.println("몸무게를 입력해주세요");
        String name = scanner.next();
        double inch = scanner.nextDouble();
        int height = scanner.nextInt();
        String result = bmiCalcAPP.bmicalc(height,inch,name);
        System.out.println(result);


    }
}

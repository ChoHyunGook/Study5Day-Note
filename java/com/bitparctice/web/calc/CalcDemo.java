package com.bitparctice.web.calc;

import java.util.Scanner;

/**
 * packageName: com.bitparctice.web.calc
 * fileName        : CalcDemo
 * author           : chohyungook
 * date               : 2022-01-25
 * desc            : 계산기 컨트롤러
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         chohyungook        최초 생성
 */
public class CalcDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalcApp calcApp = new CalcApp();
        System.out.println(calcApp.MAIN_NAME);
        System.out.println("첫번째숫자를 입력하세요.");
        int num1 = scanner.nextInt();
        System.out.println("두번째숫자를 입력하세요.");
        int num2 = scanner.nextInt();
        System.out.println("연산자 +, -, *, /, %(나머지)를 입력하세요.");
        String op = scanner.next();

        String result = calcApp.calc(num1, num2, op);

        System.out.println(result);
    }
}
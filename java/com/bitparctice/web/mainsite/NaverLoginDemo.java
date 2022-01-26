package com.bitparctice.web.mainsite;

import java.util.Scanner;

/**
 * packageName: com.bitparctice.web.mainsite
 * fileName        : NaverLoginDemo
 * author           : chohyungook
 * date               : 2022-01-25
 * desc            : 네이버 로그인 컨트롤러
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         chohyungook        최초 생성
 */
public class NaverLoginDemo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        NaverLoginApp naverLoginApp = new NaverLoginApp();
        System.out.println(naverLoginApp.MAIN_NAME);
        System.out.println(" ID : ");
        System.out.println(" PW : ");
        String id = scanner.next();
        String pw =scanner.next();
        String res = naverLoginApp.login(id,pw);
        System.out.println(res);
    }
}

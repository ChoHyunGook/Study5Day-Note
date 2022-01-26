package com.bitparctice.web.login;

import java.util.Scanner;

/**
 * packageName: com.bitparctice.web.login
 * fileName        : LoginDemo
 * author           : chohyungook
 * date               : 2022-01-26
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-26         chohyungook        최초 생성
 */
public class LoginDemo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        LoginApp loginApp = new LoginApp();
        System.out.println(loginApp.MAIN_NAME);
        System.out.println("아이디를 입력하세요.");
        String id = scanner.next();
        System.out.println("비밀번호를 입력하세요.");
        String pw = scanner.next();
        System.out.println("성함을 입력해주세요.");
        String name = scanner.next();
        String result = loginApp.login(id,pw,name);
        System.out.println(result);
    }
}

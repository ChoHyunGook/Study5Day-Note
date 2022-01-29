package com.bitparctice.web.loginver2;

import java.util.Scanner;

/**
 * packageName: com.bitparctice.web.loginver2
 * fileName        : LoginDemo2
 * author           : chohyungook
 * date               : 2022-01-27
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-27         chohyungook        최초 생성
 */
public class LoginDemo2 {
    public String execute(String id, String pw, String name) {

        LoginApp2 loginApp2 = new LoginApp2();
        return loginApp2.Login(id, pw, name);

    }
}
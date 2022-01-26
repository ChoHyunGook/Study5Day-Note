package com.bitparctice.web.login;

/**
 * packageName: com.bitparctice.web.login
 * fileName        : LoginApp
 * author           : chohyungook
 * date               : 2022-01-26
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-26         chohyungook        최초 생성
 */
public class LoginApp {
    public static String MAIN_NAME = "LOGIN VER";
    private String id;
    private String pw;
    private String name;
    static String PASSWORD = "abc";

    public String login (String id,String pw, String name){
        this.id = id;
        this.pw = pw;
        this.name=name;
        String res = "";

        if (pw.equals(PASSWORD)){
            res = String.format("%s님의 PASSWORD %s가 맞습니다. 로그인성공!",this.name,this.pw);
        }else {
            res = String.format("%s님의 ID는 %s가 맞으나 PASSWORD %s가 틀립니다. 로그인실패ㅠㅠ",this.name,this.id,this.pw);
        }

        return res;
    }

}

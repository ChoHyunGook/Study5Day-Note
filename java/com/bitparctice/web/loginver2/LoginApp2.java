package com.bitparctice.web.loginver2;

/**
 * packageName: com.bitparctice.web.loginver2
 * fileName        : LoginApp2
 * author           : chohyungook
 * date               : 2022-01-27
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-27         chohyungook        최초 생성
 */
public class LoginApp2 {
    public static String webSite = "Login Web";

    private String id;
    private String pw;
    private String name;
    static String NAME = "조현국";
    static String ID = "abc";
    static String PASSWORD = "abc";

    public String Login(String id, String pw, String name) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        String res = "";


        if (id.equals(ID) && pw.equals(PASSWORD) && name.equals(NAME)) {
            res = String.format("로그인 성공");
        } else if (id.equals(ID) && pw.equals(PASSWORD)) {
            res = String.format(" ID %s 와 PASSWORD %s는 맞으나 사용자 %s가 아닙니다. 로그인 실패"
                    , this.id, this.pw, this.name);
        } else if (id.equals(ID) && name.equals(NAME)) {
            res = String.format("사용자 %s님의 ID %s는 맞으나 비밀번호가 틀립니다.로그인실패"
                    , this.name, this.id);
        } else if (pw.equals(pw) && name.equals(NAME)) {
            res = String.format("사용자 %s님의 PASSWORD %s는 맞으나 아이디 %s가 틀립니다. 로그인실패"
                    , this.name, this.pw);
        } else if (name.equals(NAME)) {
            res = String.format("사용자 %s님의 아이디와 비밀번호가 틀립니다. 로그인실패", this.name);
        } else if (id.equals(ID)) {
            res = String.format("ID %s는 맞으나 사용자와 비밀번호가 틀립니다.로그인실패", this.id);
        } else if (pw.equals(PASSWORD)) {
            res = String.format("PASSWORD %s는 맞으나 사용자와 아이디가 틀립니다.로그인실패", this.pw);
        } else {
            res = String.format("아이디 %s,비밀번호%s,사용자%s가 모두 틀립니다. 로그인실패!");
        }

        return res;
    }
}

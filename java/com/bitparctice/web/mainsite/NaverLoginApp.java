package com.bitparctice.web.mainsite;

/**
 * packageName: com.bitparctice.web.mainsite
 * fileName        : NaverLoginApp
 * author           : chohyungook
 * date               : 2022-01-25
 * desc            : 네이버 로그인 앱
 * 클래스 변수: MAIN_NAME
 * 인스턴스 변수: id,pw
 * 로컬 변수:res
 * 파라미터 변수: id,pw
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         chohyungook        최초 생성
 */
public class NaverLoginApp {
    public static String MAIN_NAME = "NAVER";
    private String id;
    private String pw;

    public String login(String id,String pw){
        this.id=id;
        this.pw=pw;

        String res = "%s가 로그인되셨습니다.";
        return String.format(res,this.id);
    }
}

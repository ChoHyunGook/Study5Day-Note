package com.bitparctice.web.mainsite;

import java.util.Scanner;

/**
 * packageName: com.bitparctice.web.mainsite
 * fileName        : MainsiteDemo
 * author           : chohyungook
 * date               : 2022-01-25
 * desc            : 구글 메인창에 검색창에 검색하는 컨트롤러
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         chohyungook        최초 생성
 */
public class MainsiteDemo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        MainsiteApp mainsiteApp = new MainsiteApp();
        System.out.println(mainsiteApp.MAIN_NAME);
        System.out.println("Google 검색 또는 URL 입력");
        String search = scan.next();
        String res = mainsiteApp.getSearch(search);
        System.out.println(res);
    }
}

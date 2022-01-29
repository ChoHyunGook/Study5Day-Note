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
    public String execute(String search){
        MainsiteApp mainsiteApp = new MainsiteApp();
        return mainsiteApp.getSearch(search);
    }
}

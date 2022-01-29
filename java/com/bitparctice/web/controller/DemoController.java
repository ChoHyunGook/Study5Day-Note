package com.bitparctice.web.controller;

import com.bitparctice.web.bmicalc.BmiDTO;
import com.bitparctice.web.bmicalc.BmiService;
import com.bitparctice.web.calc.CalcDTO;
import com.bitparctice.web.calc.CalcService;
import com.bitparctice.web.grade.GradeDTO;
import com.bitparctice.web.grade.GradeService;
import com.bitparctice.web.login.LoginApp;
import com.bitparctice.web.login.LoginDemo;
import com.bitparctice.web.loginver2.LoginApp2;
import com.bitparctice.web.loginver2.LoginDemo2;
import com.bitparctice.web.mainsite.MainsiteApp;
import com.bitparctice.web.mainsite.MainsiteDemo;

import java.util.Scanner;

/**
 * packageName: com.bitparctice.web.controller
 * fileName        : DemoController
 * author           : chohyungook
 * date               : 2022-01-27
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-27         chohyungook        최초 생성
 */
public class DemoController {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        BmiDTO bmi=new BmiDTO();
        BmiService bmiService=new BmiService();
        CalcDTO calc =new CalcDTO();
        CalcService calcService=new CalcService();
        LoginApp loginApp=new LoginApp();
        LoginDemo loginDemo=new LoginDemo();
        LoginApp2 loginApp2 =new LoginApp2();
        LoginDemo2 loginDemo2=new LoginDemo2();
        MainsiteApp mainsiteApp=new MainsiteApp();
        MainsiteDemo mainsiteDemo=new MainsiteDemo();
        GradeDTO grade=new GradeDTO();
        GradeService gradeService=new GradeService();



        while (true) {
            System.out.println("메뉴 선택");
            String menu = "0. EXIT 1.BMICALC 2.CALC 3. GRADE 4. LOGIN 5.LOGIN VER2 6.SEARCH";
            System.out.println(menu);
            String select = scanner.next();
            String res = "";

            switch (select) {
                case "0":
                    System.out.println("Exit");return;
                case "1":
                    System.out.println(bmi.MAIN_NAME+"\n 이름 키(예시 172cm는 1.72) 몸무게 입력.");
                    System.out.println(scanner.next());
                    System.out.println(scanner.nextDouble());
                    System.out.println(scanner.nextInt());
                    res=bmiService.getBmi(bmi);
                    break;
                case "2":
                    System.out.println(calc.MAIN_NAME+"\n 첫번째숫자 두번째숫자 연산자 입력");
                    System.out.println(scanner.nextInt());
                    System.out.println(scanner.nextInt());
                    System.out.println(scanner.next());
                    res=calcService.getCalc(calc);
                    break;
                case "3":
                    System.out.println(grade.MAIN_NAME+"\n 이름 국어점수 영어점수 수학점수 입력");
                    System.out.println(scanner.next());
                    System.out.println(scanner.nextInt());
                    System.out.println(scanner.nextInt());
                    System.out.println(scanner.nextInt());
                    res=gradeService.getGrade(grade);
                    break;
                case "4":
                    System.out.println(loginApp.MAIN_NAME+"\n 아이디 비번 성함 입력");
                    res=loginDemo.execute(scanner.next(),scanner.next(),scanner.next());
                    break;
                case "5":
                    System.out.println(loginApp2.webSite+"\n 아이디 비번 성함 입력");
                    res=loginDemo2.execute(scanner.next(),scanner.next(),scanner.next());
                    break;
                case "6":
                    System.out.println(mainsiteApp.MAIN_NAME+"\n Google 검색 또는 URL 입력");
                    res=mainsiteDemo.execute(scanner.next());
                    break;
                default:res="정확한 메뉴번호를 입력해주세요.";break;

            }
            System.out.println(res);
        }
    }
}

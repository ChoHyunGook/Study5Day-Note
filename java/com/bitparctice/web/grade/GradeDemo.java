package com.bitparctice.web.grade;

import java.util.Scanner;

/**
 * packageName: com.bitparctice.web.grade
 * fileName        : GradeDemo
 * author           : chohyungook
 * date               : 2022-01-26
 * desc            : 성적표 출력 컨트롤러
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-26         chohyungook        최초 생성
 */
public class GradeDemo {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        GradeApp gradeApp =new GradeApp();
        System.out.println("성함을 입력해주세요.");
        String name =scanner.next();
        System.out.println("국어점수를 입력해주세요.");
        int kor =scanner.nextInt();
        System.out.println("영어점수를 입력해주세요.");
        int eng =scanner.nextInt();
        System.out.println("수학점수를 입력해주세요.");
        int math =scanner.nextInt();
        String res =gradeApp.grade(name,kor,eng,math);
        System.out.println(res);

    }
}

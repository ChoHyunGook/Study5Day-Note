package com.bitparctice.web.grade;

/**
 * packageName: com.bitparctice.web.grade
 * fileName        : GradeApp
 * author           : chohyungook
 * date               : 2022-01-26
 * desc            :
 *  * 사용자로부터
 *  * 이름 [          ]
 *  * 국어 [          ]
 *  * 영어 [          ]
 *  * 수학 [          ]
 *  * 을 차례대로 입력 받아서
 *  * ########## 성적표 ########
 *  * 이름: 홍길동
 *  * > 국어: 80점
 *  * > 영어: 79점
 *  * > 수학: 80점
 *  * 총점: 239점
 *  * 평균(정수): 79점
 *  * 합격여부: 합격(불합격)
 *  * #######################
 *  * 출력되는 프로그램을 작성
 *  * 단, 합격 / 불합격 기준은
 *  * 평균 60점 이상이면 합격
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-26         chohyungook        최초 생성
 */
public class GradeApp {
    public static String MAIN_NAME= "성적표";
    private String name;
    private int kor;
    private int eng;
    private int math;
    private int total=0;
    private int avg=0;
    private String pass;

    public String grade(String name,int kor,int eng,int math){

        total=kor+eng+math;
        avg=total/3;

       /*String pass=(avg>=60) ? "합격" :"불합격";*/

        if (avg>=60){
            pass="합격";
        }else
            pass="불합격";


        String res = String.format("* ########## %s ########\n" +
                "            *  * 이름: %s\n" +
                " *  * > 국어: %d\n" +
                " *  * > 영어: %d\n" +
                " *  * > 수학: %d\n" +
                " *  * 총점: %d\n" +
                " *  * 평균(정수): %d\n" +
                " *  * 합격여부: %s\n" +
                " *  * #######################"
                ,MAIN_NAME,name,kor,eng,math,total,avg,pass);
       return res;
    }

}

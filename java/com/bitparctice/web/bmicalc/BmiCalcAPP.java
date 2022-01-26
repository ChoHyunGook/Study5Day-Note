package com.bitparctice.web.bmicalc;

/**
 * packageName: com.bitparctice.web
 * fileName        : BmiCalcAPP
 * author           : chohyungook
 * date               : 2022-01-25
 * desc            : BMI 지수 계산기 앱
 * 클래스 변수: MAIN_NAME
 * 인스턴스 변수: height,inch,name
 * 로컬 변수: res
 * 파라미터 변수: height,inch,name
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         chohyungook        최초 생성
 */
public class BmiCalcAPP {
    public static String MAIN_NAME="BMI 계산기";
    private int height;
    private double inch;
    private String name;

    public String bmicalc(int height,double inch,String name){
        this.height=height;
        this.inch=inch;
        this.name=name;

        double res = height / inch / inch;

        if(res<18){

        String result= String.format("%s님의 BMI지수는 %3f이며, 저체중입니다",
                this.name,res);
            return result;
        }

        else if (res<22.9){
            String result = String.format("%s님의 BMI지수는 %3f이며, 정상입니다",
                    this.name,res);
            return result;
        }
        else if (res<=23){
            String result= String.format("%s님의 BMI지수는 %3f이며, 과체중입니다",
                    this.name,res);
            return result;
        }
        else if (res<=24.9) {
            String result = String.format("%s님의 BMI지수는 %3f이며, 위험체중입니다",
                    this.name, res);
            return result;
        }
        else if (res<=29.9) {
            String result = String.format("%s님의 BMI지수는 %3f이며, 1단계 비만입니다",
                    this.name, res);
            return result;
        }
        else if (res<=34.9) {
            String result = String.format("%s님의 BMI지수는 %3f이며, 2단계 비만입니다",
                    this.name, res);
            return result;
        }
        else {
            String result = String.format("%s님의 BMI지수는 %3f이며, 고도비만입니다",
                    this.name, res);
            return result;
        }




    }
}

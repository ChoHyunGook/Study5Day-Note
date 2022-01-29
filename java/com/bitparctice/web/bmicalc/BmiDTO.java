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
public class BmiDTO {
    public static String MAIN_NAME = "BMI 계산기";
    private int height;
    private double inch;
    private String name;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getInch() {
        return inch;
    }

    public void setInch(double inch) {
        this.inch = inch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



package com.bitparctice.web.calc;

/**
 * packageName: com.bitparctice.web.calc
 * fileName        : CalcApp
 * author           : chohyungook
 * date               : 2022-01-25
 * desc            : 계산기 앱
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         chohyungook        최초 생성
 */
public class CalcDTO {


   public static String MAIN_NAME="HELLO CALC WORLD~!";
    int num1=0;
    int num2=0;
    String op="";


    public int getNum1(){
        return num1;
    }
    public void setNum1(int num1){
        this.num1=num1;
    }
    public int getNum2(){
        return num2;
    }
    public void setNum2(int num2){
        this.num2=num2;
    }
    public String getOp(){
        return op;
    }
    public void setOp(){
        this.op=op;
    }

}
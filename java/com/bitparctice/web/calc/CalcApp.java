package com.bitparctice.web.calc;

import java.util.Scanner;

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
public class CalcApp {


   public static String MAIN_NAME="HELLO CALC WORLD~!";
    int num1=0;
    int num2=0;
    String op="";

    public String calc(int num1,int num2,String op){
        this.num1=num1;
        this.num2=num2;
        this.op=op;
        int res = 0;
        if (op.equals("+")){
            res=num1+num2;
        }
        else if (op.equals("-")){
            res=num1-num2;
        }
        else if (op.equals("*")){
            res=num1*num2;
        }
        else if (op.equals("/")){
            res=num1/num2;
        }
        else if (op.equals("%")){
            res=num1%num2;
        }
        return String.format("%d %s %d 은(는) %s 입니다.",
                this.num1,this.op,this.num2,res);

        /*switch (op){
            case "+" : res =num1+num2;break;
            case "-" : res =num1-num2;break;
            case "*" : res =num1*num2;break;
            case "/" : res =num1/num2;break;
            case "%" : res =num1%num2;break;
            return String.format("%d %s %d 의 결과값은 %d 입니다."
                ,this.num1,this.op,this.num2,res);*/
    }








}
package com.bitparctice.web.calc;

/**
 * packageName: com.bitparctice.web.calc
 * fileName        : CalcDemo
 * author           : chohyungook
 * date               : 2022-01-25
 * desc            : 계산기 컨트롤러
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         chohyungook        최초 생성
 */
public class CalcService {

    public String getCalc(CalcDTO calc) {
        int res =0;
        /*
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
*/
            switch (calc.getOp()) {
                case "+":
                    res = calc.getNum1() + calc.getNum2();
                    break;
                case "-":
                    res = calc.getNum1() - calc.getNum2();
                    break;
                case "*":
                    res = calc.getNum1() * calc.getNum2();
                    break;
                case "/":
                    res = calc.getNum1() / calc.getNum2();calc.getNum1();
                    break;
                case "%":
                    res =calc.getNum1()  % calc.getNum2();
                    break;

            }return String.format("%d %s %d 의 결과값은 %d 입니다."
                    , calc.getNum1(), calc.getOp(), calc.getNum2(), res);
    }
}
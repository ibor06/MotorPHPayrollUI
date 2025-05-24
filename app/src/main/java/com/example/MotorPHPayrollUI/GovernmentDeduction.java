/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.MotorPHPayrollUI;

import static java.lang.Math.round;

/**
 *
 * @author rovie
 */
public class GovernmentDeduction {
    public double calculateSSS(double grossPay){
    double sssDeduction = 0.0; // Initialize sssDeduction

    if (grossPay < 3250) {
        sssDeduction = 135.00;
    } else if (grossPay >= 3250 && grossPay < 3750) {
        sssDeduction = 157.50;
    } else if (grossPay >= 3750 && grossPay < 4250) {
        sssDeduction = 180.00;
    } else if (grossPay >= 4250 && grossPay < 4750) {
        sssDeduction = 202.50;
    } else if (grossPay >= 4750 && grossPay < 5250) {
        sssDeduction = 225.50;
    } else if (grossPay >= 5250 && grossPay < 5750) {
        sssDeduction = 247.50;
    } else if (grossPay >= 5750 && grossPay < 6250) {
        sssDeduction = 270.00;
    } else if (grossPay >= 6250 && grossPay < 6750) {
        sssDeduction = 292.50;
    } else if (grossPay >= 6750 && grossPay < 7250) {
        sssDeduction = 315.00;
    } else if (grossPay >= 7250 && grossPay < 7750) {
        sssDeduction = 337.50;
    } else if (grossPay >= 7750 && grossPay < 8250) {
        sssDeduction = 360.00;
    } else if (grossPay >= 8250 && grossPay < 8750) {
        sssDeduction = 382.50;
    } else if (grossPay >= 8750 && grossPay < 9250) {
        sssDeduction = 405.00;
    } else if (grossPay >= 9250 && grossPay < 9750) {
        sssDeduction = 427.50;
    } else if (grossPay >= 9750 && grossPay < 10250) {
        sssDeduction = 450.00;
    } else if (grossPay >= 10250 && grossPay < 10750) {
        sssDeduction = 472.50;
    } else if (grossPay >= 10750 && grossPay < 11250) {
        sssDeduction = 495.00;
    } else if (grossPay >= 11250 && grossPay < 11750) {
        sssDeduction = 517.50;
    } else if (grossPay >= 11750 && grossPay < 12250) {
        sssDeduction = 540.00;
    } else if (grossPay >= 12250 && grossPay < 12750) {
        sssDeduction = 562.50;
    } else if (grossPay >= 12750 && grossPay < 13250) {
        sssDeduction = 585.00;
    } else if (grossPay >= 13250 && grossPay < 13750) {
        sssDeduction = 607.50;
    } else if (grossPay >= 13750 && grossPay < 14250) {
        sssDeduction = 630.00;
    } else if (grossPay >= 14250 && grossPay < 14750) {
        sssDeduction = 652.50;
    } else if (grossPay >= 14750 && grossPay < 15250) {
        sssDeduction = 675.00;
    } else if (grossPay >= 15250 && grossPay < 15750) {
        sssDeduction = 697.50;
    } else if (grossPay >= 15750 && grossPay < 16250) {
        sssDeduction = 720.00;
    } else if (grossPay >= 16250 && grossPay < 16750) {
        sssDeduction = 742.50;
    } else if (grossPay >= 16750 && grossPay < 17250) {
        sssDeduction = 765.00;
    } else if (grossPay >= 17250 && grossPay < 17750) {
        sssDeduction = 787.50;
    } else if (grossPay >= 17750 && grossPay < 18250) {
        sssDeduction = 810.00;
    } else if (grossPay >= 18250 && grossPay < 18750) {
        sssDeduction = 832.50;
    } else if (grossPay >= 18750 && grossPay < 19250) {
        sssDeduction = 855.00;
    } else if (grossPay >= 19250 && grossPay < 19750) {
        sssDeduction = 877.50;
    } else if (grossPay >= 19750 && grossPay < 20250) {
        sssDeduction = 900.00;
    } else if (grossPay >= 20250 && grossPay < 20750) {
        sssDeduction = 922.50;
    } else if (grossPay >= 20750 && grossPay < 21250) {
        sssDeduction = 945.00;
    } else if (grossPay >= 21250 && grossPay < 21750) {
        sssDeduction = 967.50;
    } else if (grossPay >= 21750 && grossPay < 22250) {
        sssDeduction = 990.00;
    } else if (grossPay >= 22250 && grossPay < 22750) {
        sssDeduction = 1012.50;
    } else if (grossPay >= 22750 && grossPay < 23250) {
        sssDeduction = 1035.00;
    } else if (grossPay >= 23250 && grossPay < 23750) {
        sssDeduction = 1057.50;
    } else if (grossPay >= 23750 && grossPay < 24250) {
        sssDeduction = 1080.00;
    } else if (grossPay >= 24250 && grossPay < 24750) {
        sssDeduction = 1102.50;
    } else {
        sssDeduction = 1125.00;
    }

    return round(sssDeduction); // Return the rounded SSS deduction
}

    public double calculatePhilHealth(double grossPay) { return grossPay * 0.035; }
    
    public double calculatePagIbig(double grossPay) { return grossPay * 0.02; }
    
    public double calculateWithholdingTax(double grossPay) {
    double tax = 0.0;

   if (grossPay <= 20832) {
    tax = 0;
} else if (grossPay > 20832 && grossPay < 33333) {
    tax = (grossPay - 20833) * 0.20;
} else if (grossPay >= 33333 && grossPay < 66667) {
    tax = ((grossPay - 33333) * 0.25) + 2500;
} else if (grossPay >= 66667 && grossPay < 166667) {
    tax = ((grossPay - 66667) * 0.30) + 10833;
} else {
    tax = ((grossPay - 166667) * 0.32) + 40833.33;
}

    return tax;
}
    public double totalDeductions(double grossPay) {
        return calculateSSS(grossPay) + calculatePhilHealth(grossPay) + calculatePagIbig(grossPay)+ calculateWithholdingTax(grossPay);
    }
}





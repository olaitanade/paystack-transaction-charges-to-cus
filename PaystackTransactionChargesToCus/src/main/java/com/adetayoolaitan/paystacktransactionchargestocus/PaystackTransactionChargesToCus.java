package com.adetayoolaitan.paystacktransactionchargestocus;

public class PaystackTransactionChargesToCus {
    private static final String TAG = "PaystackTransactionChar";
    private static final Double DECIMAL_FEE = 0.0150;
    private static final int FEE_CAP = 2000;
    private static final int FLAT_FEE = 100;

    public static String calculateTotalPrice(String amount){
        Double amt = Double.parseDouble(amount);
        if(amt<100){
            return String.valueOf((int)(amt+1));
        }else if(amt<2500){
            return calculateFor2500Below(amt);
        }else{
            return calculateFor2500Above(amt);
        }
    }

    private static String calculateFor2500Below(Double amount){
        Double applicableFees = DECIMAL_FEE * amount;
        if(applicableFees>FEE_CAP){
            return String.valueOf(amount+FEE_CAP);
        }else{
            return String.valueOf((int)(((amount)/(1-(DECIMAL_FEE)))+0.01));
        }
    }

    private static String calculateFor2500Above(Double amount){
        Double applicableFees = (DECIMAL_FEE * amount)+FLAT_FEE;
        if(applicableFees>FEE_CAP){
            return String.valueOf(amount+FEE_CAP);
        }else{
            return String.valueOf((int)(((amount+FLAT_FEE)/(1-(DECIMAL_FEE)))+0.01));
        }
    }
}

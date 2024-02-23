package com.susu8991.easy;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(new BigDecimal("8920.0").intValue());

        String bindCardRiskPinList = "jd_5dd6759714c7a,jd_5dd6759714c7a";
        List<String> pinArray = Arrays.stream(bindCardRiskPinList.split(",")).collect(Collectors.toList());
        if(pinArray.contains("jd_5d6759714c7a")){
            System.out.println("risk");

        }
        Integer a= null;
        System.out.println(String.valueOf(a));
    }
}

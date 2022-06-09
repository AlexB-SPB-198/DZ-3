package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    
        double [] num={1.5,5.7,-8.8,3.0,5.3,1.1,-2.0,-6.1,0.5,4.2,9.4,5.7,9.6,8.3,2.5};
        System.out.println(Arrays.toString(num));
        double result =0;
        double light =0;
        boolean ads=false;
        for (Double i:num) {

         if(i<0){
             ads =true;
         }else {
             if (ads){
                 result +=i;
                 light++;
             }
         }
        }

        System.out.println("Среднее арифметическое положительных чисел расположенных после первого отрицательного "+ result/ light);
    }
}

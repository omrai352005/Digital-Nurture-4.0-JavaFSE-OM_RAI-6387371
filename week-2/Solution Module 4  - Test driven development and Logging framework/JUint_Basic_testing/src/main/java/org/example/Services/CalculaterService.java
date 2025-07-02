package org.example.Services;

public class CalculaterService {

    public static int addTwoNumbers(int a , int b ){
        return a+b ;
    }
    public static int productNumber (int a , int b){
         return a*b ;
    }
    public static int divideNumver(int a , int b){
       return a/b ;
    }
    public static int sumAnyNumber(int ...numbers){
        int s = 0 ;
        for(int n : numbers){
            s+= n ;
        }
        return s ;
    }
}

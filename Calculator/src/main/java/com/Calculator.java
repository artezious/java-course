package com;

/**
 * Created by WEO on 7/6/16.
 */
public class Calculator {

    public int add (int ... numbers){
        int result = 0;
        for (int i:numbers){
            result+=i;
        }
        return result;
    }
    public int sub (int ... numbers){
        int result = 0;
        for (int i:numbers){
            result-=i;
        }
        return result;
    }
    public int mul (int ... numbers){
        int result = 0;
        for (int i:numbers){
            result*=i;
        }
        return result;
    }
    public int div (int ... numbers){
        int result = 0;
        for (int i:numbers){
            result/=i;
        }
        return result;
    }


}

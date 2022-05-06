/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.huyraw.mathutil.core;

/**
 *
 * @author HuyRaw
 */
public class MathUtil {

    //Viet ham tinh giai thua
    //0! - 1! = 1
    //21! tran kieu long
    // <0 ! khong tinh dc, ko co giai thua am
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 0..20");
        }

        if (n == 0 || n == 1) return 1;
           
        long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }

}
//TDD - Test Driven Development
//Test Firat Development
//khi viet code phai luu y viet test cases/tinh huong test
//test ngay nhung gi ta viet ra ngay trc khi viet hoan thanh!!

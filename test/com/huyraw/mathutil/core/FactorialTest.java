/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.huyraw.mathutil.core;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author HuyRaw
 */
public class FactorialTest {

    @Test
    public void checkFactorialGivenRightAgrumentReturnWell() {
        long expected = 120;
        long actual = MathUtil.getFactorial(5);

        Assert.assertEquals(expected, actual);

        Assert.assertEquals(720, MathUtil.getFactorial(6));
        Assert.assertEquals(1, MathUtil.getFactorial(0));
    }

    // check xem có xh ngoại lệ data hay ko?
    @Test(expected = IllegalArgumentException.class)
    public void checkFactorialGivenRightAgrumentThrowsException() {
        // ta khong dung asertEquals methol(vi can 2 value ss)
        MathUtil.getFactorial(-5);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.huyraw.mathutil.core;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author HuyRaw
 */
@RunWith(value = Parameterized.class)
public class AdvancedFactorialTesting {

    //Ta viết kt mới, tách data ra các lệnh kiểm tra hàm
    //data này có thể đặt ở file, txt, .csv, .exel, database bên ngoài
    //Data để test là mảng 2 chiê do có dạng cặp output/expected
    //mảng 2 chiều sẽ đc nạp từ bên ngoài hoặc tạo trong đây
    @Parameters
    public static Object[][] initData() {
        return new Integer[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120}
        };
    }

    //ta cần map 2 cột vào 2 biến để feed vào hàm checkFactorial
    //call it "tham số hóa"/parameterized testing
    @Parameter(value = 0) //map cột 0 của data
    public int input;
    @Parameter(value = 1) //map cột 1 của data
    public long expected;

    @Test
    public void checkFactorialGivenRightAgrumentReturnWell() {

        Assert.assertEquals(expected, MathUtil.getFactorial(input));

    }
}

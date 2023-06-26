/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.bardingl.mathutil.core.test;

import static org.bardingl.mathutil.core.MathUtility.*;  //cu phap danh cho static
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author ADMIN
 */
public class MathUtilityAdvancedTest {
    //đây là hàm chuẩn bị bộ data theo dạng array để sau đó fill vào hàm
    //assertE() ở dưới
    public static Object[][] initTestData(){
    Object testData[][] = { {0, 1},
                            {1, 1},
                            {2, 2},
                            {3, 6},
                            {4, 24}};
    
    return testData;
    }
    @ParameterizedTest
    @MethodSource("initTestData")
        public void testFactorialGivenRightArgumentRunsWell(int n, long expected){
            assertEquals(expected, getFactorial(n));
        }
    
}

//=
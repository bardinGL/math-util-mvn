/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.bardingl.mathutil.core.test;

import org.bardingl.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ADMIN
 */
public class MathUtilityTest {
    
//    public MathUtilityTest() {
//    }
    @Test
    public void testFactorialGivenRightArgumentRunswell(){
//        assertEquals(69, 70 - 1);
            assertEquals(1, MathUtility.getFactorial(0));
            assertEquals(1, MathUtility.getFactorial(1));
            assertEquals(2, MathUtility.getFactorial(2));
            assertEquals(24, MathUtility.getFactorial(4));
    
    }
    
}

//tDD - Test Driven Developemnent
//TDD việc viết code và test được thực hiện song song với nhau
//Viết code cho App

//DDT - Data Driven Test
//cách fill dữ liệu bằng cách tham số hóa(parameterized)
//tách bộ data test ra khỏi bộ lệnh test và insert vào bộ tham số
//
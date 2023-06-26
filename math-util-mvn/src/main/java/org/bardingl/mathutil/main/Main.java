/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bardingl.mathutil.main;

import org.bardingl.mathutil.core.MathUtility;



/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //test hàm getF() với các test case đã chuẩn bị
        //test case #1, check getF()
        int n = 0;                  //check0!
        long expected = 1;          //có bằng 1 hem
        long actual;                // = mấy thì phải chạy hàm
        //sau đó so sánh e == a ko
        actual = MathUtility.getFactorial(n);
        System.out.println(n + "! | expected: " + expected + " | actual: " + actual);

        //test case #2, check getF(n) with
        n = 1;
        System.out.println("1! | expected: 1 | actual: " + MathUtility.getFactorial(n));

        //test case #3, check getF(n) with
        n = 2;
        System.out.println("2! | expected: 2 | actual: " + MathUtility.getFactorial(n));

        //test case #4, check getF(n) with
        n = 3;
        System.out.println("3! | expected: 6 | actual: " + MathUtility.getFactorial(n));

        //test case #5, check getF(n) with
        n = 4;
        System.out.println("4! | expected: 24 | actual: " + MathUtility.getFactorial(n));
        
        //test case #6, check getF() with n = -1 kì vọng trả về ngoại lệ
        n = -1;
        System.out.println("-1! | expected: EXCEPTION" + " | actual ");
        MathUtility.getFactorial(n);
    }

}

//TEST CASE và TEST DRIVEN DEVELOPEMENT
//hai việc viết/test code được tiến hành song song, đan xen luôn
//1 hàm đc viết r thì trong q trình viết đã chuẩn bị luôn
// bộ test cases, nhiều test case để test hàm đúng sai luôn
//ta liên tục sửa code/ thêm code và chạy test case, run test
// tương tự QC là làm test case/ run test
// khác với QC phải đảm bảo việc viết code cho app
//Test case là 1 bộ data đưa vào hàm/app để trsst hàm/app đúng sai
// gồm : input, expected value, và cách thực thi test case luôn
//đưa data, nhấn cái gì, xem cái gì, kết luận cái gì!!
//hàm getF() có bộ data sẽ là: 0!->1, 1! ->1, nếu là âm giai thừa / 21 giai thừa
//-> chửi
// nhiều bộ datam mỗi bộ ưng với 1 tình huống xài app/hàm, gọi test case
//các test case được viết theo quy tắc cơ bản như sau /format như sau
// Test Case #1: check getF(n) with n = 0
//Steps/Procedures:     -cách để test hàm
//                      1.given n = 0
//                      2.call getF(n = 0)
//Expected Value = kì vọng gì, khi thực hiện cái steps ở trên expected value: 1
//
//giải nghĩa: cho n = 0 vào hàm getF() và hy vọng hàm trả về con số 1
//
// Test Case #2: check getF(n) with n = 1
//Steps/Procedures:     -cách để test hàm
//                      1.given n = 1
//                      2.call getF(n = 1)
//Expected Value = kì vọng gì, khi thực hiện cái steps ở trên expected value: 1
//
//giải nghĩa: cho n = 1 vào hàm getF() và hy vọng hàm trả về con số 1
//trong trường hợp expected != actual -> dùng màu đỏ
//trong trường hợp expected == actual -> dùng màu xanh
//

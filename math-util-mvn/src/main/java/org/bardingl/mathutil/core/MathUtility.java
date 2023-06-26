/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bardingl.mathutil.core;

/**
 *
 * @author ADMIN
 */
//dan qc kiem tra app la tat nhien tuy nhien cung can dev kiem tra unit test level
//thu vien mang ten jar
//cach dat ten package phai dung chuan: phan biet -> de su dung , luu tru du lieu du` trung` ten
//viet ten package bang cach dao nguoc ten mien
//tsao ko viet source?
// => de tim kiem namespace
//class này clone lại 100% cái class.util.Math của jdk
//math.sqrt() hay match.sin()
public class MathUtility {

    public static final double PI = 3.1415;
//hàm này tính giai thừa n! =1*2*3*..n
//học tiêu chuẩn viết code
//thiết kế, quy ước cho hàm/method này: 
//0! = 1! = 1
//không áp giai thừa cho số âm. n<0 = chửi -> ném ra exception
// không áp với giai thừa cho số >20. vì kích cỡ kiểu Long 
//21! = chửi, ném ra exc
//Kỹ thuật lập trình: Agile 
// chia code thành các giai đoạn bằng nhau, gọi là Sprint(vdu: 2 tuần = 1 Sprint)
//Task Driven Developement(kĩ thuật test cho từng Sprint)
//-> là kĩ thuật vừa viết code vừa viết test

    public static long getFactorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid input n. N must be between 0->20");
        }
        long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;

        }
        return product;
    }
}

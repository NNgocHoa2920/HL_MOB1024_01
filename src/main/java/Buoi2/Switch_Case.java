/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi2;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class Switch_Case {
    public static void main(String[] args) {
        //VD: NHẬP VÀO THÁNG VÀ IN RA SỐ NGÀY
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập tháng (1-12)");
        int thang= sc.nextInt();
        switch(thang){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("Thang " + thang+ " có 31 ngày");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("Thang " + thang+ " có 30 ngày");
                break;
            case 2:
                System.out.println("Thang 2 thì có 28 hoặc 29");
                break;
            default:
                System.out.println("Tháng nhập k hợp lệ");
                break;
                
        }
    }
}

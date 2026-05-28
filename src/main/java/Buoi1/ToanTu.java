/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi1;

/**
 *
 * @author nguye
 */
public class ToanTu {
    public static void main(String[] args) {
        int a=5, b=7, c=2, kq;
        a+=2; // a= a+2=5+2=7
       
        int x= a++;//gán trước rồi + sau => a=7
        int y= ++b; //cộng trước rồi ms gán y =8
        int z = --c;// trừ trước rồi mới gán z=1
         kq= a++ + ++b- --c;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(kq);//kq=14
    }
    
}

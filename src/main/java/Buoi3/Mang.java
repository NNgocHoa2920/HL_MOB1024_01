/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class Mang {
    public static void main(String[] args) {
        //vòng lặp for thì duyệt theo vị trí
        //vòng lặp for-each thì duyệt theo phần tử
        Scanner sc = new Scanner(System.in);
        int[] a; //khai báo mảng số nguyên chưa biết số phần tử
        int b[];
        String c[]= new String[5]; //khai báo 1 mảng chứa 5 chuỗi
        double[] d1= new double[]{2,3,4,5,6};//khai báo 1 mảng là số thực, 5 phần tử, đã được khởi tạo
        double[] d2 = {2,3,4,5,6};
        
        //PHẦN 1: NHẬP MẢNG
        System.out.println("Nhập số lượng phần tử của mảng: ");
        int n= sc.nextInt();
        //khai báo mảng số nguyên tên là arr có n phần tử
        int [] arr= new int[n];
        System.out.println("Nhập các phần tử của mảng \n");
        for(int i=0; i<n; i++){
            System.out.printf("a[%d]=", i);
            arr[i]= sc.nextInt();
        }
        
        //PHẦN 2: XUẤT MẢNG
        //vòng lặp for
        System.out.println("MẢNG VỪA NHẬP LÀ: \n");
//        for(int i=0; i<n; i++){
//            System.out.println(arr[i] +" ");
//        }
//for-each
        for(int phantu : arr)
        {
            System.out.println(phantu +" ");
        }
        
        //PHẦN 3: SẮP XẾP MẢNG DÙNG THƯ VIỆN
        Arrays.sort(arr);//để sắp xếp tăng dần
        //Arrays.toString(arr): ĐỂ CHUYỂN MẢNG THÀNH CHUỖI THÌ MỚI ĐỌC ĐC
        System.out.println("Mang sau khi sắp xếp tăng dần là: "+ Arrays.toString(arr));
        //Muốn sắp xếp giảm dần thì cứ dùng hàm sort để tăng dần rồi duyệt ngược lại
        System.out.println("Mảng sau khi giảm dần");
        for(int i= arr.length-1; i>=0; i--)
        {
            System.out.println(arr[i]+" ");
        }
            
    }
}

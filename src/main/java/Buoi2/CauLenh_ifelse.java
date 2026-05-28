/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi2;

/**
 *
 * @author nguye
 */
public class CauLenh_ifelse {
    public static void main(String[] args) {
        //VD VỀ IF ĐƠN
//        double diem = 3;
//        if(diem>=5)
//        {
//            System.out.println("Chúc mừng bạn đã qua môn");
//        }

//VÍ DỤ VỀ IF...ELSE
//        int so =8;
//        if(so%2==0){
//            System.out.println("Là số chẵn");
//        }
//        else{
//            System.out.println("Là số lẻ");
//        }
//  

//VÍ DỤ VỀ IF..ELSE IF....ELSE
        double diemTb=7;
        if(diemTb>8){
            System.out.println("giỏi");
        }
        else if(diemTb >=6.5 &&diemTb <=8){
            System.out.println("Khá");
        }
        else if (diemTb >=5 && diemTb <6.5){
            System.out.println("Tb");
        }
        else
        {
            System.out.println("Yếu");
        }
    }
    
}

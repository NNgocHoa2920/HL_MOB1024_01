/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP_basic;

/**
 *
 * @author nguye
 */
public class Main {
    public static void main(String[] args) {
        //Phần 1: Khai bado và khởi tạo đối tượng
        //SInhVien: tên class
        //new: toán tử để khởi tạo đối tượng
        
        //Khởi tạo 1 đối tượng sv1 k có tham số
        SinhVien sv1= new SinhVien();
         //Khởi tạo có tham số
         SinhVien sv2 = new SinhVien("Nguyễn Văn A", 2008,"Hà Nội");
         
         //Phần 2: sử dụng kết hợp hàm
         sv2.inThongTin();
         
         //CÓ THỂ SỬ DỤNG SETTER ĐỂ GÁN GIÁ TRỊ
         sv1.setTen("Nguyễn Văn B");
         sv1.setNamSinh(2009);
         sv1.setQueQuan("Hà Giang");
         sv1.inThongTin();
    }
}

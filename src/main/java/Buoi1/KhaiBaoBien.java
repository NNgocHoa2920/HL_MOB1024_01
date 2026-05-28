/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi1;

/**
 *
 * @author nguye
 */
public class KhaiBaoBien {
    /*
       ************KHÁI NIỆM CỦA BIẾN*********
     ĐN: Dùng để lưu trữ giá trị trong lập trình, nó lưu ở trong RAM 
    và chỉ chó ý nghĩa khi chạy code
    CÔNG THỨC: 
     kieu_du_lieu + ten_bien =[giá trị khởi tạo ban đầu]
    + kieu_du_lieu: định nghĩa giá trị muốn lưu trữ
    + ten_bien: giúp định danh
    + [giá trị khởi tạo ban đầu]: đưa giá trị về đúng kiểu dữ liệu , và chỉ có ý nghĩa ban đầu
     *******CÁC KIỂU DỮ LIỆU TRONG JAVA*******
      + KIỂU SỐ NGUYÊN: int, long, byte, short,....
      + KIỂU SỐ THỰC: float, double
      + KIỂU CHUỖI: String VD: "a"
      + KIỂU KÍ TỰ: char   'a'
      + KIỂU LOGIC: Boolean ( true, false)
      + KIỂU VAR: tỰ ĐỊNH NGHĨA THEO GIÁ TRỊ
    var a =1    var c= 'c'   var s = "abc"
    
    ********BIẾN TOÀN CỤC VÀ BIẾN CỤC BỘ*************
    + Biến toán cục: Khai báo bên ngoài phương thức ( hàm), khai báo để dùng chung
       - BẮT BUỘC PHẢI KHAI BÁO CÓ DẤY GẠCH Ở DƯỚI _
    VD: _bientoancuc;
    + Biến cục bộ: Khai báo bên trong phương thức, và chỉ sử dụng được bên trong phương thức đấy thôi
    */
    public static void main(String[] args) {
        int a=1; 
        
        String name1= "abc";
        String name2;
        name2="xyz";
        name2= "123";// dạng ghi code, dòng dưới sẽ ghi đè code của dòng trên
        String s = name1+name2;
        System.out.println(s);
        
        double so1= 3.5;
        
        var v1= true; //v1 có kiểu dữ liệu là boolean
        
        //1. ÉP KIỂU STRING VỀ SỐ
        String number1= "100";
        String number2 = "12";
        String kq;
        kq= number1+ number2;
        System.out.println(kq);
        int kq2= Integer.parseInt(number1)+ Integer.parseInt(number2);
        System.out.println(kq2);
        
            
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP_basic;

/**
 *
 * @author nguye
 */
/*
 CLASS= lớp 
 Thuộc tính + phương thức
PHẠM VI truy cập: 
         + public: có thể truy cập mọi nơi
         + private: Chỉ được sử dụng bên trong chính class đó ( Tính đóng gói)
*/
public class SinhVien {
    //PHẦN 1: KHAI BÁO TẤT CẢ CÁC THUỘC TÍNH MÀ ĐỐI TƯỢNG CẦN
    private String ten;
    private int namSinh;
    private String queQuan;
    
    /*PHẦN 2: Khởi tạo contructor
      + Contructor: là hàm khởi tạo dùng để tạo các đối tượng
      + Có 2 loại contructor:
            1. Contructor không có tham số: Dùng để khởi tạo đối tượng có giá trị ngay từ ban đầu 
            2. Contructor có tham số: Dùng để khởi tạo 1 đối tựng có ngay giá trị ( fix cứng)
        Tên contructor trùng với tên class
    Cách tạo tự động: ấn chuột phải -> insert code -> contructor
    */

    public SinhVien() {
    }

    public SinhVien(String ten, int namSinh, String queQuan) {
        this.ten = ten;
        this.namSinh = namSinh;
        this.queQuan = queQuan;
    }
    
    //PHẦN 3: TẠO GETTER VÀ SETTER
    /*
        Khi thuộc tính bi private thì muốn lấy hay gán giá trị cho thuộc tính thì phải thông qua getter và setter
        + getter: lấy giá trị
        + setter: gán giá trị
    */

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
    
    //PHẦN 4: TRIỂN KHAI PHƯƠNG THỨC (method, hàm) theo yêu cầu đề bài
    //bản chất thằng này là hàm in thông tin
//    @Override
//    public String toString() {
//        return "SinhVien{" + "ten=" + ten + ", namSinh=" + namSinh + ", queQuan=" + queQuan + '}';
//    }
    
    public void inThongTin(){
        System.out.printf("Sinh viên có tên là: %s, năm sinh: %d, quê quán ở: %s \n",ten, namSinh, queQuan);
    }
    
    
}

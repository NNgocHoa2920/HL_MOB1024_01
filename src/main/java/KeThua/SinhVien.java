/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KeThua;

/**
 *
 * @author nguye
 */
/*
 class sinhvien là class con và kế thuộc tính và phương thức của class Nguoi
  SỬ DỤNG TỪ KHÓA extends ĐỂ KẾ THỪA
*/
public class SinhVien extends Nguoi {
    //CHỈ KHAI BÁO THUỘC TÍNH VÀ PHƯƠNG THỨC MÀ CLASS NGUOI KHÔNG CÓ
    //Phần 1: Khai báo thuộc tính
    private String Mssv;
    private String NganhHoc;
    
    //Phần 3: Contructor

    public SinhVien() {
    }

    public SinhVien(String Mssv, String NganhHoc) {
        this.Mssv = Mssv;
        this.NganhHoc = NganhHoc;
    }

    public SinhVien(String Mssv, String NganhHoc, String ten, String Sdt, String cmt) {
        super(ten, Sdt, cmt);
        this.Mssv = Mssv;
        this.NganhHoc = NganhHoc;
    }
    
    //Phần 3

    public String getMssv() {
        return Mssv;
    }

    public void setMssv(String Mssv) {
        this.Mssv = Mssv;
    }

    public String getNganhHoc() {
        return NganhHoc;
    }

    public void setNganhHoc(String NganhHoc) {
        this.NganhHoc = NganhHoc;
    }
    
    //PHẦN 4: phương thức

    @Override
    public void inthongtin() {
        super.inthongtin(); 
        System.out.println("MSSV là: "+Mssv+ "NGành học: "+ NganhHoc);
    }

 
    
    
    
}

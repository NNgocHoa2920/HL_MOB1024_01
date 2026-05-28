/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTapTongHop;

/**
 *
 * @author nguye
 */
public class Nguoi {
    //b1: khai báo các thuộc tính
    private String Cmt;
    private String HoTen;
    private int NamSinh;
    private String GioiTinh;
    
      //b2: Tạo contructor
    public Nguoi(){}
 //contructor có tham số
    public Nguoi(String Cmt, String HoTen, int NamSinh, String GioiTinh) {
        this.Cmt = Cmt;
        this.HoTen = HoTen;
        this.NamSinh = NamSinh;
        this.GioiTinh = GioiTinh;
    }
    
    //b3: Tajo getter va setter 

    public String getCmt() {
        return Cmt;
    }

    public void setCmt(String Cmt) {
        this.Cmt = Cmt;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int NamSinh) {
        this.NamSinh = NamSinh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }
    //b4: Tjao phương thức
       public void InThongTin()
    {
        System.out.printf("Ten:%s - Năm sinh : %d - giới tính: %s- CMT : %s \n", HoTen,NamSinh, GioiTinh, Cmt);
    }
}

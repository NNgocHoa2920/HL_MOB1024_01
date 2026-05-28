/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTapTongHop;

/**
 *
 * @author nguye
 */
public class SinhVien extends Nguoi {
    private double diem;

    public SinhVien() {
    }

    public SinhVien(double diem) {
        this.diem = diem;
    }

    public SinhVien(double diem, String Cmt, String HoTen, int NamSinh, String GioiTinh) {
        super(Cmt, HoTen, NamSinh, GioiTinh);
        this.diem = diem;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public void InThongTin() {
        System.out.printf("Diểm %f: -", diem);
        super.InThongTin(); 
       
        
    }
    
    
    
    
}

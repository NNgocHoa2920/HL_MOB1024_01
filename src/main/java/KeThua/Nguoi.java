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
 Tính kế thừa: Class con kế thừa thuộc tính và phương thức của lớp cha
   lớp cha không được hưởng gì của class con hết

CLASS NGUOI: LÀ CLASS CHA
*/
public class Nguoi {
    //PHẦN 1: LIỆT KÊ CÁC THUỘC TÍNH MÀ ĐỐI TƯỢNG CẦN
    private String ten;
    private String Sdt;
    private String cmt;
    
    //Phần 2: Contructor

    public Nguoi() {
    }

    public Nguoi(String ten, String Sdt, String cmt) {
        this.ten = ten;
        this.Sdt = Sdt;
        this.cmt = cmt;
    }
    //PHẦN 3: GETTER VÀ SETTER

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }

    public String getCmt() {
        return cmt;
    }

    public void setCmt(String cmt) {
        this.cmt = cmt;
    }
//Phần 4: Phương thức
//    @Override
//    public String toString() {
//        return "Nguoi{" + "ten=" + ten + ", Sdt=" + Sdt + ", cmt=" + cmt + '}';
//    }
    public void inthongtin(){
        System.out.println("Nguoi có ten: "+ ten+" có sdt: "+ Sdt+ "cmt là: "+ cmt);
    }
    
    
    
    
}

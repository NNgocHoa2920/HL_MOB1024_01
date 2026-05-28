/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTapTongHop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class SinhVienSERVICE {
     Scanner sc = new Scanner(System.in);
   
    /*
        ARRAYLIST VÀ LIST: có thể chứa bất kì dữ liệu nào
        sử dụng đc add() để thêm dữ lịeeu
    THƯỜNG SỬ DỤNG ĐỂ CHỨA 1 ĐỐI TƯỢNG
    trong arraylisst k truyền đc kiểu int mà mình truyền kiểu Integer
    */
    List<SinhVien> _lstSV; //khai bao list danh sách sv - dùng để kwu trữ toàn bộ sinh viên
    SinhVien _sv; //khai báo 1 đối tượng tên là _sv
    String _input; //dùng chung cho các tham số nhập vào
    
    /*Tạo contructor sinhvienservice để lát nữa sang hàm main ta gọi lại class sinhvienserrvice để 
    có thể sử dụng được các hàm trong class này
    */
    
    public SinhVienSERVICE(){
        _lstSV = new ArrayList(); //khởi tạo 1 đối tượng list sinh viên
        FakeData();
    }
    
    //CÁCH FIX CỨNG DỮ LIỆU, KHI MÀ CHẠY PROJECT LÀ _lstSV đã lưu trữ dữ liệu rồi
    public void FakeData(){
        _lstSV.add(new SinhVien(6,"12356","NGuyễn An",2009,"nữ"));
        _lstSV.add(new SinhVien(8,"12356","NGuyễn B",2009,"nAM"));
        _lstSV.add(new SinhVien(9,"12356","NGuyễn C",2009,"nAM"));
        _lstSV.add(new SinhVien(2,"12356","NGuyễn D",2009,"nữ"));
    }
    public void xuatDs(){
        for(SinhVien sv : _lstSV){
            sv.InThongTin();
        }
    }
    
    //nhập ds bằng bàn phím
    public void themSinhVien(){
        System.out.println("Mời bạn chọn số lượng sv cần nhập");
        _input = sc.nextLine();
        String luachon;
        do{
            System.out.println("Mời bạn chọn số lượng sv cần nhập");
             _input = sc.nextLine();
            for(int i=0; i< Integer.parseInt(_input); i++){
                _sv= new SinhVien();
                System.out.println("Mời nhập tên: ");
                _sv.setHoTen(sc.nextLine());
                System.out.println("Mòi nhâp năm sinh");
                _sv.setNamSinh(sc.nextInt());
                sc.nextLine();
                System.out.println("Moi ban nhập giới tính");
                _sv.setGioiTinh(sc.nextLine());
                System.out.println("moi nhap cmt");
                _sv.setCmt(sc.nextLine());
                System.out.println("Moi nhap điểm");
                _sv.setDiem(sc.nextDouble());
                sc.nextLine(); //khi từ kiểu số sang kiểu chữ thì thêm dòng này để xóa bộ nhớ đệm
                //sau khi nhập xong thì phải add toàn bộ dữ liệu của đối tượng _sv vừa nhập vào _lstSV
                _lstSV.add(_sv);
                
            }
            System.out.println("Ban có muốn nhập tiếp hay k (y/n");
            luachon = sc.nextLine().toUpperCase();//chuyển in thường thành in hoa
            
        }while(luachon.equals("Y"));
    }
}

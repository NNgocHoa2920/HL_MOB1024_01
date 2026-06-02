/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTapTongHop;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVienSERVICE sv = new SinhVienSERVICE();
        int luaChon;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Xuất danh sách vừa nhập");
            System.out.println("3. Tìm kiếm");
            System.out.println("4. Xóa");
            System.out.println("5. Sửa");
            System.out.println("6. Kết thúc");
            System.out.print("Chọn chức năng: ");
            luaChon = sc.nextInt();
            
            switch (luaChon) {
                case 1:
                   sv.themSinhVien();
                    break;
                case 2:
                     sv.xuatDs();
                    break;
                case 3:
                        sv.timKiem();
                    break;
                case 4:
                   sv.xoaSV();
                    break;
                case 5:
                    
                    break;
                case 6:
                    System.out.println("Chuong trinh ket thuc doi");
                    break;

                default:
                    System.out.println("Moi ban chon lai, lua chon khong hop le");

            }

        }  while(luaChon != 6);

    }
    
    
}

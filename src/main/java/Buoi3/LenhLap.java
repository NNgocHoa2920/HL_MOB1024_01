/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi3;

/**
 *
 * @author nguye
 */
public class LenhLap {
    public static void main(String[] args) {
        //WHILE: Kiểm tra điều kiện thỏa mãn thì mới lặp
//        int i=0;
//        while(i<5){
//            System.out.println("Tôi là sinh viên fpt");
//            i++;
//        }
        
        //DO..WHILE: CHẠY ÍT NHẤT 1 LẦN RỒI MỚI KIỂM TRA ĐIỀU KIỆN
//        int i=1;
//        do{
//            System.out.println("Tôi là sinh viên fpt");
//            i++;
//        }while(i<=5);
        
        //for( gitri khoi tao; điều kiện; bước nhảy)
//        for(int i=0; i<5; i+=2){
//            System.out.println("Tôi đẹp trai");
//        }

//break: thoát khỏi vòng lặp
         // i chạy từ 0 đến 9
//        for (int i = 0; i < 10; i++) {
//
//            // Nếu i bằng 4
//            if (i == 4) {
//
//                System.out.println("i bằng 4. Dừng vòng lặp FOR.");
//
//                // Dừng vòng lặp
//                break;
//            }
//
//            // In giá trị hiện tại của i
//            System.out.println("Giá trị hiện tại của i: " + i);
//        }
//
//        // Chạy sau khi kết thúc vòng lặp
//        System.out.println("Chương trình tiếp tục sau vòng lặp FOR.");
//continue: nhảy qua bước lặp tiếp. bỏ qua bước lặp hiện tại
         for (int i = 1; i <= 5; i++) {

            // Nếu i bằng 3
            if (i == 3) {

                System.out.println("Gặp i = 3 -> bỏ qua");

                // Bỏ qua lần lặp hiện tại
                continue;
            }

            // In giá trị của i
            System.out.println("Giá trị hiện tại của i: " + i);
        }
       
    }
}

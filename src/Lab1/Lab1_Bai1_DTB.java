package Lab1;

import java.util.ArrayList;
import  java.util.Scanner;
public class Lab1_Bai1_DTB {
    public static class thongTin{
        private String hoTen;
        private double diem;
        public String getHoten(){
            return  hoTen;
        }
        public  void setHoTen(String hoTen){
            this.hoTen = hoTen;
        }
        public  double getDiem(){
            return diem;
        }
        public  void setDiem(double diem){
            this.diem = diem;
        }
        @Override
        public String toString() {
            return "Ho ten: " + hoTen + "| Diem: " + diem;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sinh vien: ");
        int soLuong = sc.nextInt();
        sc.nextLine();
        ArrayList<thongTin> inf = new ArrayList<>();
        for (int i = 0; i < soLuong; i++){
            System.out.println("Nhap thong tin sinh viem " + (i + 1) + ":");
            thongTin tt = new thongTin();
            System.out.println("Nhap ho ten: ");
            String ten = sc.nextLine();
            tt.setHoTen(ten);
            System.out.println("Nhap diem: ");
            double diem = sc.nextDouble();
            tt.setDiem(diem);
            sc.nextLine();
            inf.add(tt);
        }
        System.out.println("Danh sach sinh vien:");
        for (thongTin tt : inf){
            System.out.println(tt);
        }
    }
}

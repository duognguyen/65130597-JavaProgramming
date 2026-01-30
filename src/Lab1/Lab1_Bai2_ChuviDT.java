package Lab1;

import java.util.Scanner;

public class Lab1_Bai2_ChuviDT {
    public static class rectangle{
        private double cdai;
        private  double crong;
        public double getCdai(){ return cdai;}
        public  double getCrong(){ return crong;}
        public  void setCdai(double cdai){this.cdai = cdai;}
        public  void setCrong(double crong){this.crong = crong;}
        public  double cvi(){
            return (cdai + crong) * 2;
        }
        public  double dtich(){
            return cdai * crong;
        }
        public double minCanh(){
            return cdai > crong ? crong : cdai;
        }
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rectangle rec = new rectangle();
        System.out.println("Nhap chieu dai: ");
        double cdai = sc.nextDouble();
        rec.setCdai(cdai);
        sc.nextLine();
        System.out.println("Nhap chieu rong: ");
        double crong = sc.nextDouble();
        rec.setCrong(crong);
        System.out.println("Chu vi hinh chu nhat: " + rec.cvi());
        System.out.println("Dien tich hinh chu nhat: " + rec.dtich());
        System.out.println("Chieu dai canh nho nhat: " + rec.minCanh());
    }
}

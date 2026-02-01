package Lab1;

import java.util.Scanner;

public class Lab1_Bai3_TheTich {
    public static class khoiChuNhat{
        private double cdai;
        private double crong;
        private  double ccao;
        public  khoiChuNhat(double cdai, double crong, double ccao){
            this.cdai=cdai;
            this.crong = crong;
            this.ccao = ccao;
        }
        public double getCrong(){ return crong; }
        public  double getCdai(){ return cdai; }
        public  double getCcao(){ return  ccao;}
        public  double theTich(){
            return cdai*crong*ccao;
        }
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        double cdai = sc.nextDouble();
        System.out.println("Nhap chieu rong: ");
        double crong = sc.nextDouble();
        System.out.println("Nhap chieu cao: ");
        double ccao = sc.nextDouble();
        khoiChuNhat klp = new khoiChuNhat(cdai,crong,ccao);
        System.out.println("The tich khoi hop chu nhat: " + klp.theTich());
    }
}